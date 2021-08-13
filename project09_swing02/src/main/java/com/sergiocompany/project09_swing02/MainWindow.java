/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergiocompany.project09_swing02;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class MainWindow extends JFrame implements ActionListener {

    private JLabel description, result;
    private JTextField inputDolars;
    private JButton calculateButton;

    MainWindow() {
        //setBounds(550, 150, 300, 300);//tamaño y posición
        //setSize(300,300);
        //setLocationRelativeTo(null);
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension screenSize = myScreen.getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(height / 2, width / 5);
        setLocationRelativeTo(null);
        setTitle("Misión TIC");//Titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();//contenedor
        panel.setLayout(null);//permite ubicar elementos cómo se desee
        this.getContentPane().add(panel); //El panel se encarga de ubicar los elementos
        description = new JLabel("Convertir de Dolares a Pesos");
        description.setBounds(10, 10, 250, 50);
        panel.add(description);//agrega el elemento a la ventana
        inputDolars = new JTextField();
        inputDolars.setBounds(10, 60, 100, 25);
        panel.add(inputDolars);
        result = new JLabel("0.0");
        result.setBounds(30, 100, 100, 25);
        panel.add(result);
        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 140, 100, 25);
        calculateButton.addActionListener(this);
        panel.add(calculateButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dolars = inputDolars.getText();
        double pesos = Double.parseDouble(dolars) * 3900;
        result.setText("" + pesos);
        JOptionPane.showMessageDialog(this, "" + pesos);
    }

}
