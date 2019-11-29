/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBpart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author eulinle_sd2022
 */
public class Model {
    
    
        
        

    public Model() {
    }
    
    public void cough(String brand, String gen, String typ, int qty, double price){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `medicineforcough` (`brandname`, `genericname`, `type`, `quantity`, `price`) VALUES ('" + brand + "', '" + gen + "', '" + typ + "', " + qty + ", " + price + ")";
            stmt.executeUpdate(sql);
            
            con.close();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
        
    }
    
    public void headache(String brand, String gen, String typ, int qty, double price){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `medicineforheadache` (`brandname`, `genericname`, `type`, `quantity`, `price`) VALUES ('" + brand + "', '" + gen + "', '" + typ + "', " + qty + ", " + price + ")";
            stmt.executeUpdate(sql);
            con.close();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        
        }
    }
    
    public void bodypain(String brand, String gen, String typ, int qty, double price){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `medicineforbodypain` (`brandname`, `genericname`, `type`, `quantity`, `price`) VALUES ('" + brand + "', '" + gen + "', '" + typ + "', " + qty + ", " + price + ")";
            stmt.executeUpdate(sql);
            con.close();
            
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        
        }
    }
    
    public void allergies(String brand, String gen, String typ, int qty, double price){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO `medicineforallergies` (`brandname`, `genericname`, `type`, `quantity`, `price`) VALUES ('" + brand + "', '" + gen + "', '" + typ + "', " + qty + ", " + price + ")";
            stmt.executeUpdate(sql);
            con.close();
        } catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
            
        }
    
    }
    
    
    
}
