package co.pragra.learning.aopdemo;

import co.pragra.learning.aopdemo.model.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.sql.*;
import java.util.Date;

//@SpringBootApplication
//@EnableAspectJAutoProxy
public class AopDemoApplication {

    public static void main(String[] args) {
        final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/pragra";
        final String USER = "app";
        final String PASSWORD = "app";

        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD)) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM table_student");

            Student student = new Student();
            while (resultSet.next()) {
                student.setId(resultSet.getInt("student_id"));
                student.setFirstName(resultSet.getString("first_name"));
                student.setLastName(resultSet.getString("lastname"));
                student.setCreateDate(resultSet.getDate("create_date"));
            }
            System.out.println(student);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date createDate;
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}