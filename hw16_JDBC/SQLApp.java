package com.softserve.hometasks.hometask1.hw16_JDBC;
/*
* Install SQL Server and launch it (https://dev.mysql.com/downloads/connector/j/)
Create DB on the serverCREATE DATABASE <db name>;
Download jdbc driver (e.g. https://jar-download.com/artifacts/mysql/mysql-connector-java)
Create new project and add jar file to the project
Set up connection from java project to SQL Server
Create table Cars with fields id (int), model (String), year_of_production (int)
Insert into the table new records about three different cars
Input year of production from the console and receive an information about corresponding cars
Delete the oldest cars
*/

import java.sql.*;
import java.util.Scanner;

public class SQLApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String jdbcURL = "jdbc:postgresql://localhost:5432/testavto";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL);
            System.out.println("Connection successful");

            String sql = "INSERT INTO Cars (model, year_of_production) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
            PreparedStatement preparedStatement3 = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Audi");
            preparedStatement.setInt(2, 2001);
            preparedStatement2.setString(1, "BMW");
            preparedStatement2.setInt(2, 1999);
            preparedStatement3.setString(1, "Toyota");
            preparedStatement3.setInt(2, 2005);
            int rows = preparedStatement.executeUpdate();
            int rows2 = preparedStatement2.executeUpdate();
            int rows3 = preparedStatement2.executeUpdate();
            if (rows > 0 & rows2 > 0 & rows3 > 0) {
                System.out.println("Raw successfully created");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection error");
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(jdbcURL);
            System.out.println("Connection successful");
            System.out.println("Enter the cars year");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT *  FROM Cars WHERE year_of_production = " + year + "");
            while (rs.next()) {
                String avtoName = rs.getString("model");
                System.out.println(avtoName + "\n");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
