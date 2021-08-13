/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.project10_swing03.views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class LoginView extends JPanel implements ActionListener {
    
    Image LoginImage;
    JTextField username;
    JPasswordField password;
    JButton loginButton, clearButton, exitButton;
    
    public LoginView() {
        configPanel();
        initComponents();
    }
    
    private void configPanel() {
        setLayout(null);
    }
    
    private void initComponents() {
        header();
        inputData();
        footer();
    }
    
    private void header() {
        JLabel description = new JLabel("LogIn");
        description.setBounds(160, 10, 200, 30);
        this.add(description);
    }
    
    private void inputData() {
        JLabel labelUserName = new JLabel("Username");
        labelUserName.setBounds(80, 200, 100, 30);
        this.add(labelUserName);
        username = new JTextField();
        username.setBounds(160, 200, 120, 30);
        this.add(username);
        
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(80, 240, 80, 30);
        this.add(labelPassword);
        password = new JPasswordField();
        password.setBounds(160, 240, 120, 30);
        this.add(password);
    }
    
    private void footer() {
        loginButton = new JButton("Login");
        loginButton.setBounds(140, 290, 80, 30);
        loginButton.addActionListener(this);
        this.add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(140, 330, 80, 30);
        clearButton.addActionListener(this);
        this.add(clearButton);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(140, 370, 80, 30);
        exitButton.addActionListener(this);
        this.add(exitButton);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File imageLogin = new File("src/assets/Goku.png");
        try {
            Image image = ImageIO.read(imageLogin);//lectura de la imagen
            this.LoginImage = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            g.drawImage(this.LoginImage, 100, 40, this);
        } catch (IOException e) {
            System.out.println("Error de lectura");
            JOptionPane.showMessageDialog(this, "Error en la lectura de imagen");
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        //JOptionPane.showMessageDialog(this, pass);//valida si está obteniendo la contraseña
        Object clickedButton = e.getSource();//Retorna el nombre de variable del botón que se presiona
        if (clickedButton == clearButton) {
            username.setText("");
            password.setText("");
        } else if (clickedButton == exitButton) {
            System.exit(0);
        } else {
            String pass = new String(this.password.getPassword());
            JOptionPane.showMessageDialog(this, pass);
        }
    }
}
