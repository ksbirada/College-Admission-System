/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import  java.sql.SQLException;
import static java.sql.DriverManager.getConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Chinnu
 */
public class Course 
{
    Connection conn=null;
    public static Connection connDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=getConnection("jdbc:mysql://localhost:3308/course","root","oracle");
            return conn;
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    } 
}
