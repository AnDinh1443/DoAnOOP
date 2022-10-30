/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import com.sun.jdi.connect.spi.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import testgui.model.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static javax.management.remote.JMXConnectorFactory.connect;
import java.sql.*;



/**
 *
 * @author 84907
 */
public class DAO {
    Connection connect;
    public DAO(){
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=BookList;"
                    + "encrypt=false";
                    
            String user="sa";
            String pass="sa";
            connect=DriverManager.getConnection(url, user, pass);
            if(connect !=null){
                System.out.println("Thanh cong");}
        }
        catch(Exception e){
            System.out.println("Fail");
        }
        
    }
    public boolean addBook(Book book){
        String sql="INSERT INTO Book(Masach,Tensach,Theloai,Tacgia,Soluong,Nhaxuatban,Namxuatban,Gia)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps= connect.prepareStatement(sql);
            ps.setString(1,book.getMasach());
            ps.setString(2, book.getTensach());
            ps.setString(3, book.getTheloai());
            ps.setString(4,book.getTacgia());
            ps.setInt(5,book.getSoluong());
            ps.setString(6,book.getNhaxuatban());
            ps.setInt(7,book.getNamxuatban());
            ps.setInt(8,book.getGia());
            
            return ps.executeUpdate()>0;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    public ArrayList<Book> getBookList(){
        ArrayList<Book> list = new ArrayList<>();
        String sql = "SELECT *FROM Book";
        try{
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book book=new Book();
                book.setMasach("Masach");
                book.setTensach(rs.getString("Tensach"));
                book.setTheloai(rs.getString("Theloai"));
                book.setTacgia(rs.getString("Tacgia"));
                book.setSoluong(rs.getInt("Soluong"));
                book.setNhaxuatban(rs.getString("Nhaxuatban"));
                book.setNamxuatban(rs.getInt("Namxuatban"));
                book.setGia(rs.getInt("Gia"));
                
                list.add(book);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[]args){
        new DAO();
    }

   
}
