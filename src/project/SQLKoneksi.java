/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLKoneksi {
    
    Connection koneksi;
    Statement stmt;
    
    public void getKoneksi(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost/managementroom","root","");
                stmt = koneksi.createStatement();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal"+e.getMessage());
        }
            
    }
        
  
    


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
