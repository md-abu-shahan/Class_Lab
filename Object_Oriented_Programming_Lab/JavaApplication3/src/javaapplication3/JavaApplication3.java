/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author AHN ASS
 */
public class JavaApplication3 extends JFrame{
private Container c;
    private JLabel l1,l2;
    private JTextField tf;
    private JPasswordField p;
    private JButton b;
    
    
    JavaApplication3(){
        c = getContentPane();
        c.setBackground(Color.yellow);
        c.setLayout(null);
        l1=new JLabel("ID");
        l1.setBounds(10,10,100,100);
        
        c.add(l1);
        
        l2=new JLabel("pass");
        l2.setBounds(10,120,100,100);
        c.add(l2);
        
        tf=new JTextField();
        tf.setBounds(110,10,100,70);
        c.add(tf);
        
        p=new JPasswordField();
        p.setBounds(110,120,100,70);
        c.add(p);
        
        b= new JButton("send");
        b.setBounds(200,300,100,100);
        c.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                String s1=tf.getText();
                String s2=p.getText();
                
                if(s1.equals("admin")&&s2.equals("123")){
                    JOptionPane.showMessageDialog(null, "Welcome admin");
                }else if(s1.equals("user")&&s2.equals("pass")){
                    JOptionPane.showMessageDialog(null, "Welcome User");
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }
        });
    }
    public static void main(String[] args) {
        JavaApplication3 f= new JavaApplication3();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,10,500,500);
        
    }
    
}
