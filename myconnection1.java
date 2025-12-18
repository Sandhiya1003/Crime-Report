/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
/**
 *
 * @author sandh
 */
public class myconnection1 {
     public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crime_report","root","Sandhiya200310");
        }
        catch(Exception d)
        {
            System.out.println(d);
        }
        return con;
    }
}
