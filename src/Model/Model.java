/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 2ndyrGroupB
 */
public class Model {

    public boolean purchase(String uname, String bname, int qty, double cash) {
        boolean success = false;
        boolean exist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE `brandname`='" + bname + "'");

            while (rs.next()) {
                double price = rs.getDouble("price");
                int stock = rs.getInt("stock");
                if (rs.getString("brandname").equals(bname)) {
                    ResultSet rs1 = stmt.executeQuery("SELECT * FROM `userlist` WHERE `username`='" + uname + "'");
                    while (rs1.next()) {
                        if (rs1.getString("username").equals(uname)) {
                            int age = rs1.getInt("age");
                            double adultAmount = qty * price;
                            double seniorAmount = ((qty * price) * .80);
                            if (age >= 18 && age <= 59) {
                                if (qty > stock) {
                                    JOptionPane.showMessageDialog(null, "Insufficient stock to purchase!");
                                } else if (qty == stock) {
                                    if (cash < adultAmount) {
                                        JOptionPane.showMessageDialog(null, "Insufficient cash to purchase!");
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "The amount is: " + adultAmount);
                                        String sql = "DELETE FROM `medicine` WHERE `brandname`='" + bname + "'";
                                        stmt.executeUpdate(sql);
                                        JOptionPane.showConfirmDialog(null, "Successfully purchased!\nYour change is:" + (cash - adultAmount));
                                        return success = true;
                                    }
                                } else {
                                    if (cash < adultAmount) {
                                        JOptionPane.showMessageDialog(null, "Insufficient cash to purchase!");
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "The amount is: " + adultAmount);
                                        String sql = "UPDATE `medicine` SET quantity=" + (stock - qty) + "WHERE `brandname`='" + bname + "'";
                                        stmt.executeUpdate(sql);
                                        JOptionPane.showConfirmDialog(null, "Successfully purchased!\nYour change is:" + (cash - adultAmount));
                                        return success = true;
                                    }
                                }
                            } else {
                                if (qty > stock) {
                                    JOptionPane.showMessageDialog(null, "Insufficient stock to purchase!");
                                } else if (qty == stock) {
                                    if (cash < adultAmount) {
                                        JOptionPane.showMessageDialog(null, "Insufficient cash to purchase!");
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "The amount is: " + seniorAmount);
                                        String sql = "DELETE FROM `medicine` WHERE `brandname`='" + bname + "'";
                                        stmt.executeUpdate(sql);
                                        JOptionPane.showConfirmDialog(null, "Successfully purchased!\nYour change is:" + (cash - seniorAmount));
                                        return success = true;
                                    }
                                } else {
                                    if (cash < seniorAmount) {
                                        JOptionPane.showMessageDialog(null, "Insufficient cash to purchase!");
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "The amount is: " + seniorAmount);
                                        String sql = "UPDATE `medicine` SET quantity=" + (stock - qty) + "WHERE `brandname`='" + bname + "'";
                                        stmt.executeUpdate(sql);
                                        JOptionPane.showConfirmDialog(null, "Successfully purchased!\nYour change is:" + (cash - seniorAmount));
                                        return success = true;
                                    }
                                }
                            }

                        }

                    }

                }
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(null, "Medicine do not exist!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }

        return success;
    }

    public int login(String username, String password) {
        int success = 400;
        if ("Lealyn".equals(username) && "Eulin".equals(password)) {
            return success = 500;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM `userlist` WHERE username='" + username + "'");

                if (rs.next()) {
                    if (rs.getString("password").equals(password)) {
                        return success = 600;
                    } else {
                        JOptionPane.showMessageDialog(null, "Password is incorrect!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username do not exist!");
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error Connecting to database!");
            }
        }
        return success;
    }

    public boolean register(String uname, int age, String pass) {
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO `userlist`(`username`, `age`, `password`) VALUES ('" + uname + "'," + age + ",'" + pass + "')");
            return success = true;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
        return success;
    }

    public boolean addMedicine(String brand, String gen, String typ, int qty, double price) {
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String a = "Allergies";
            String b = "Headache";
            String c = "Body Pain";
            String d = "Cough";
            String sql1 = "INSERT INTO `medicine` (`brandname`, `genericname`, `type`, `quantity`, `price`) VALUES ('" + brand + "', '" + gen + "', '" + typ + "', " + qty + ", " + price + ")";

            if (typ.equals(a) == true) {
                stmt.executeUpdate(sql1);
            } else if (typ.equals(b) == true) {
                stmt.executeUpdate(sql1);
            } else if (typ.equals(c) == true) {
                stmt.executeUpdate(sql1);
            } else if (typ.equals(d) == true) {
                stmt.executeUpdate(sql1);
            }
            con.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
        return success;
    }

    public boolean removeMedicine(String bname) {
        boolean success = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM `medicine` WHERE brandname='" + bname + "'";
            stmt.executeUpdate(sql);
            return success = true;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Eror connecting to database!");
        }
        return success;
    }

}
