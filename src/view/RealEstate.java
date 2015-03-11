/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author User
 */
public class RealEstate {
      JFrame frame1=new JFrame();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JLabel label1,label2,label3,label4,label5,label6;
    JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6;
    
    
    public void createUserInterface(){
        frame1.add(panel1);
        panel1.add(panel2);
        panel2.setLayout(new GridLayout(300,400));
        
        label1=new JLabel("Lot Number");
        panel2.add(label1);
        textfield1=new JTextField("      ");
        panel2.add(textfield1);
         label2=new JLabel("First Name");
        panel2.add(label2);
        textfield2=new JTextField("      ");
        panel2.add(textfield2);
         label3=new JLabel("Last Name");
        panel2.add(label3);
        textfield3=new JTextField("      ");
        panel2.add(textfield3);
         label4=new JLabel("Price");
        panel2.add(label4);
        textfield4=new JTextField("      ");
        panel2.add(textfield4);
         label5=new JLabel("Square Feet");
        panel2.add(label5);
        textfield5=new JTextField("      ");
        panel2.add(textfield5);
         label6=new JLabel("Number Of Bedrooms");
        panel2.add(label6);
        textfield6=new JTextField("      ");
        panel2.add(textfield6);
        
        
        
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(100, 100);
        panel1.setBackground(Color.LIGHT_GRAY);
        frame1.setVisible(true);
        
        
    }
    
    

public static void main(String[] args){
    RealEstate re=new RealEstate();
    re.createUserInterface();


}
    
}
