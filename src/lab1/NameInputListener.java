/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dworgolet
 */
public class NameInputListener implements ActionListener{

    
    private MainWindow window;
    
    public NameInputListener(MainWindow window) {
        this.window = window;
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
        String name = window.getName();
        String msg = "Hello " + name;
        window.setName(msg);
        
    }
    
    
    
}
