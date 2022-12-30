package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        final String URL = "jdbc:mysql://localhost:3306/";
        final String BD = "fabrica";

        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(URL + BD , username , password);
            System.out.println("conexión establecida");


            String sql = "INSERT INTO `fabrica`.`personas` (id , nombre , apellido, fecha_nacimiento) VALUES (? , ? , ? , ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, "Juan");
            stmt.setString(3, "Pérez");
            stmt.setDate(4, Date.valueOf("1970-01-01"));

            stmt.executeUpdate();

            stmt.close();
            connection.close();

            System.out.println("conexión cerrada");

        } catch (SQLException e) {
            System.out.println("hubo problemas con la conexión");
        }


    }
}