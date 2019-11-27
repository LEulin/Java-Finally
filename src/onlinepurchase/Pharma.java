/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinepurchase;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author eulinle_sd2022
 */
public class Pharma extends JPanel{
    private JButton button1;
    
    public Pharma() {
        button1 = new JButton();

        this.setLayout(null);
        this.setVisible(true);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setSize(300, 300);
        button1.setText("text");
        button1.setLocation(0, 0);
        this.add(button1);
    }

    
}
