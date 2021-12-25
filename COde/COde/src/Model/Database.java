/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Umer
 */
public class Database {
    public static Connection con(String username,String fb){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","");
//        JOptionPane.showMessageDialog(null, "Connected");
Statement stm =con.createStatement();
String sql="INSERT INTO  feedback VALUES('"+username+"','"+fb+"')";
stm.execute(sql);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }

    return con;
}

    
}
