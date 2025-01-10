/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelelangan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author ACER
 */
public class databaseConnection {
    private static final String URL="jdbc:mysql://localhost:3306/db_lelang";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
