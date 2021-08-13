/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.project11_swing04_layout.views;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Sergio
 */
public class MainWindow extends JFrame{

    public MainWindow() {
        configWindow();
        initComponets();
    }
    
    private void configWindow() {
        Toolkit myScreen = Toolkit.getDefaultToolkit();//detecto pantalla
        Dimension screenSize = myScreen.getScreenSize();//obtengo tamaño de pantalla
        int height = screenSize.height;//alto
        int width = screenSize.width;//ancho
        setSize(height / 2, width / 3);
        setLocationRelativeTo(null);
        setTitle("Misión TIC");//Titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void initComponets() {
        LoginView login = new LoginView();
        this.getContentPane().add(login);
    }

}
