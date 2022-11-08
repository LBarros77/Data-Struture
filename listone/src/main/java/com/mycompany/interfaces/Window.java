package com.mycompany.interfaces;

import com.company.codes.GraphicBarCode;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame; // Windows resources

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {
    private static JLabel numberLabel, textLabel;
    private static JButton add, ok, cancel;
    private static JTextField numberField = new JTextField(20);
    private final GraphicBarCode backend;
    
    public Window() {
        setTitle("Gráfico de barras do programa de impressão");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        this.backend = new GraphicBarCode();
    }
    
    public void buttons() {
        setLayout(null);
        
        numberLabel = new JLabel("Insira um Número\n de 1 a 30:");
        numberField = new JTextField(2);
        add = new JButton("Adicionar");
        ok = new JButton("Ok");
        cancel = new JButton("Cancelar");
        
        numberLabel.setBounds(10, 20, 120, 25);
        numberField.setBounds(10, 50, 120, 25);
        add.setBounds(10, 80, 120, 25);
        ok.setBounds(10, 110, 120, 25);
        cancel.setBounds(10, 140, 120, 25);
        
        add(numberLabel);
        add(numberField);
        add(add);
        add(ok);
        add(cancel);
        
        add.addActionListener(this);
        ok.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == add) {
            int number = Integer.parseInt(numberField.getText());
            this.backend.addNumber(number);
            numberField.setText("");
        }
        
        if(e.getSource() == ok) {
            System.out.println(this.backend.convertNumberAll());
            textLabel = new JLabel(this.backend.convertNumberAll()); // Is not show in window
            textLabel.setBounds(40, 20, 120, 120);
            add(textLabel);
        }
        
        if(e.getSource() == cancel) {
            System.exit(0);
        }
    }
}