package com.softserve.hometasks.hometask1.hw16_JDBC;

import java.sql.*;

public class SQLApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testavto");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("CREATE TABLE Cars (id INTEGER NOT NULL AUTO_INCREMENT, model VARCHAR(255), year_of_production INTEGER)");
        rs.close();
        st.close();
    }


    public SQLApp() throws SQLException {
    }
}
