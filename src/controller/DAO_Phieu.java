/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_Phieu {
    public static Connection getConnection(){
        Connection c=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=BookList;"
                    + "encrypt=false";
                    
            String user="sa";
            String pass="sa";
            c=DriverManager.getConnection(url, user, pass);
//            if(connect !=null){
//                System.out.println("Thanh cong DAO");}
        }
        catch(Exception e){
            System.out.println("That bai");
           
        }
        return c;
    }
    public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
        new DAO_Phieu();
    }
}
