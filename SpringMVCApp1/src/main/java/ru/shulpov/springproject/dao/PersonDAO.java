package ru.shulpov.springproject.dao;

import org.springframework.stereotype.Component;
import ru.shulpov.springproject.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_NUMBER;
    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "12345";
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public PersonDAO() {
//        people = new ArrayList<Person>();
//        people.add(new Person(++PEOPLE_NUMBER, "Vasya", 19, "Vasya@mail.ru"));
//        people.add(new Person(++PEOPLE_NUMBER, "Gena", 25, "Gena@mail.ru"));
//        people.add(new Person(++PEOPLE_NUMBER, "Oleg", 43, "Oleg@mail.ru"));
//        people.add(new Person(++PEOPLE_NUMBER, "Alex", 12, "Alex@mail.ru"));
    }

    public List<Person> index() throws SQLException {
        List<Person> people = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet= statement.executeQuery(SQL);

            while(resultSet.next()) {
                Person person = new Person();

                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return people;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO public.person(" +
                    "name, age, email)" +
                    "VALUES ('" + person.getName() + "', "+ person.getAge() +", '"+ person.getEmail() +"');";
            statement.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Person updatedPerson) {
    }

    public void delete(int id) {

    }
}
