/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Model.Model;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import leulinsonlinepharmacyui.PharmaDashboard;

/**
 *
 * @author 2ndyrGroupB
 */
public class Controller {

    Model model = new Model();

    public boolean purchase(String username, String brandname, String quantity, String money) {
        boolean success = false;
        try {
            int qty = Integer.parseInt(quantity);
            try {
                double cash = Double.parseDouble(money);
                if (model.purchase(username, brandname, qty, cash) == true) {
                    return success = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Money should be a number!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantity should be a number!");
        }
        return success;
    }
    
    public int login(String username, String password){
        int success = 400;
        success = model.login(username, password);
        return success;
    }
    
    public boolean register(String uname, String age, String password){
        boolean success = false;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `userlist` WHERE username='" + uname + "'");
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Username is already taken!");
            } else {
                try{
                    int myAge = Integer.parseInt(age);
                    if(myAge < 18){
                         JOptionPane.showMessageDialog(null,"Minors are not allowed to register!");
                    } else {
                        return success = model.register(uname, myAge, age);
                    }
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Age should only be a number!");
                }       
            }
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Eror connecting to database!");
        
        }
        return success;
    }
    
    public boolean addMedicine(String gname, String bname, String type, String cost, String stock){
        boolean success = false;
        try{
            double price = Double.parseDouble(cost);
            try{
                int qty = Integer.parseInt(stock);
                return success = model.addMedicine(gname, bname, type, price, qty);
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Stock should be a number!");
            } 
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price should be a number!");
        }
        return success;
    }
    
    
    
}
