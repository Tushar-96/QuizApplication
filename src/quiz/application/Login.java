package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton next, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 600);
        add(image);
        
        JLabel heading = new JLabel("Login");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(Color.GRAY);
//        heading.setForeground(new Color.(r, g, b));
        add(heading);
        
        JLabel name = new JLabel("Enter your name :");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.GRAY);
//        heading.setForeground(new Color.(r, g, b));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfname.setBackground(Color.lightGray);
        add(tfname);
        
        next = new JButton("Next");
        next.setBounds(735, 270, 120, 25);
        next.setBackground(Color.darkGray);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.darkGray);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 600);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            String name = tfname.getText();
            setVisible(false);
            new Next(name);
        } else if (ae.getSource() == back){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Login();    //anonymous object
    }
}
