package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Next extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    
    Next(String name) {
        this.name=name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + "!!! " );
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        heading.setForeground(Color.GRAY);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "-->> Read the following instruction properly" + "<br><br>" +
                "Disclaimer - This game is just made for fun, Don't get offended over some content." + "<br><br>" +
                "1. There are 10 multiple choice questions in this quiz." + "<br><br>" +
                "2. Each question has 10 points." + "<br><br>" +
                "3. Each question has time limit of 15 seconds." + "<br><br>" +
                "4. If you did not respond in 15 second you will be directed to next page." + "<br><br>" +
                "-->> Good, Luck" + "<br><br>" +
            "<html>"
        );
        rules.setForeground(Color.GRAY);
        add(rules);
                
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.darkGray);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.darkGray);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
        
    public static void main(String[] args){
        new Next("User");
    }
}
