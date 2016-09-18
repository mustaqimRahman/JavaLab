/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Mustaqim
 */
public class Command_GUI extends JFrame  {
    
    executeCommand obj = new executeCommand();
    
    
    private static final int width = 500;
    private static final int height = 500;
    
    private JPanel panel1 = new JPanel();
    // panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
    private JTextField input1 = new JTextField();
    private JTextArea output1 = new JTextArea();
    private JButton button1 = new JButton("Execute") ;

    public Command_GUI() {
        
        setTitle("My CLI");
        setSize(width, height); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        button1.setPreferredSize(new Dimension(100, 50));
        input1.setPreferredSize(new Dimension(200, 50));
        output1.setPreferredSize(new Dimension(400, 300));
        setVisible(true);
        
    Container contentPane = getContentPane();
    
    panel1.add(input1);
    panel1.add(output1);
    panel1.add(button1);
    
    contentPane.add(panel1);
    
    button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String command = input1.getText();
                System.out.println(" " +  command);
                String output = obj.executeCommand(command);
                
                output1.append(output);

//                EmptyLoop empty = new EmptyLoop(Integer.parseInt(data));
//                empty.itereate_loop();

//                for (int i = 0; i < Integer.parseInt(data); i++) {
//                    output01.append(String.valueOf(i));
//                }
            }
        });
    
    
//    button1.addActionListener(new ActionListener(){
//    
//       public void actionPerformed(ActionEvent ae){
//        String data = input1.getText();
//    }
//    }
    
    
    }

    
//    public static void main(String[] args){
//        
//        Command_GUI gui = new Command_GUI();
//        gui.setVisible(true);
        
    
 //   }
    
}
