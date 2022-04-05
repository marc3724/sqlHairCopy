package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class visual implements ActionListener {
    JFrame frame1 = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton deleteUserButton = new JButton("delete user");
    JTextField EmailField = new JFormattedTextField();
    JTextField passwordField = new JTextField(); //JPasswordField
    JLabel EmailLabel = new JLabel("Email");
    JLabel passwordLabel = new JLabel("password");
    JButton resetButton = new JButton("reset");


//    JLabel titel = new JLabel("Login");

    public  void look () {

        //BUTTONS
        loginButton.setBounds(25,100,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        deleteUserButton.setBounds(25,150,100,25);
        deleteUserButton.setFocusable(false);
        deleteUserButton.addActionListener(this);

        resetButton.setBounds(25,400,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        //FIELDS
        EmailField.setBounds(225,100,200,25);
        passwordField.setBounds(225,150,200,25);
        EmailLabel.setBounds(150,100,75,25);
        passwordLabel.setBounds(150,150,75,25);

        frame1.add(loginButton);
        frame1.add(deleteUserButton);
        frame1.add(resetButton);
        frame1.add(EmailField);
        frame1.add(passwordField);
        frame1.add(EmailLabel);
        frame1.add(passwordLabel);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(700,500);
        frame1.setLayout(null);
        frame1.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //clears the fields for text
        if (e.getSource()== resetButton) {
            EmailField.setText("");
            passwordField.setText("");
        }


        //makes user connect
        if (e.getSource() == loginButton){
            String email = EmailField.getText();
            String password = passwordField.getText();
            // Employee user2 = new Employee (email,password);

            com.company.mysql msql = com.company.mysql.getInstance();
            msql.TryUserLogin(email,password);

        /*mysql msql = mysql.getInstance();
        Employee user1 = new Employee("Karen Klippesen", "kk@klipmig.dk",
                "Klippevej 14 Hårstrup 4100", "11223344", "1111");
        msql.logUserIn(user1.email,user1.password);*/
        }
    }
}
