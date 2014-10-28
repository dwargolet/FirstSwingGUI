/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dworgolet
 */
public class MainWindow extends JFrame implements ActionListener{
  
    private JLabel lblPrompt, lblOutput;
    private JTextField txtInput;
    private JButton btnSayHello;
    private Container container;
      
    
    public MainWindow(){
        lblPrompt = new JLabel("Enter Name");
        lblOutput = new JLabel();
        txtInput = new JTextField();
        btnSayHello = new JButton("Say Hello");
        btnSayHello.addActionListener(this);
//        btnSayHello.addActionListener(new NameInputListener(this));
        container = this.getContentPane();
        container.add(lblPrompt, BorderLayout.WEST);
        container.add(txtInput, BorderLayout.CENTER);
        container.add(lblOutput, BorderLayout.EAST);
        container.add(btnSayHello, BorderLayout.SOUTH);
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtInput.getText();
        String msg = "Hello " + name;
        lblOutput.setText(msg);
        
    }

//    public JLabel getLblOutput() {
//        return lblOutput;
//    }
//
//    public void setLblOutput(JLabel lblOutput) {
//        this.lblOutput = lblOutput;
//    }
//
//    public JTextField getTxtInput() {
//        return txtInput;
//    }
//
//    public void setTxtInput(JTextField txtInput) {
//        this.txtInput = txtInput;
//    }
    
    
    
}
