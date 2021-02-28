/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject01;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MYProject01 extends JFrame implements ActionListener {

    private Container c;
    private JButton b1, b2, ab11, ub12, db13, cb14, Calculate1;
    private JPanel p1, p2;
    private JLabel l1, l2, head1, l11, l12, l13, l14,CGPA;
    private CardLayout cd;
    private ImageIcon ima;
    private Font f1, f2;
    private JTextField ft11, lt12, pt13, gt14,total1,Ccreadet1;
    private JTable ta1;
    private DefaultTableModel mo1;
    private JScrollPane sp1;

    
    private String[] col1 = {"Course code", "Course name", "Creade", "GPA"};
    private String[] row1 = new String[4];
    
    
    
    MYProject01() {

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        Ccreadet1 = new JTextField();
        Ccreadet1.setBounds(600,10,100,50);
        c.add(Ccreadet1);
        total1 = new JTextField();
        total1.setBounds(600,50,100,50);
        c.add(total1);
        
        f1 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        f2 = new Font("Arial", Font.BOLD, 14);

        cd = new CardLayout();

        p1 = new JPanel();
        p1.setBounds(150, 600, 300, 50);
        c.add(p1);

        p2 = new JPanel(cd);
        p2.setBounds(0, 0, 800, 600);
        c.add(p2);

        l1 = new JLabel();
        l1.setLayout(null);
        label01();
        l1.setBounds(10, 10, 500, 500);
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        c.add(l1);
        p2.add(l1);

        l2 = new JLabel("hlw");
        l2.setBounds(10, 10, 500, 500);
        l2.setOpaque(true);
        l2.setBackground(Color.GREEN);
        c.add(l2);
        p2.add(l2);

        b1 = new JButton("Previous");
        b1.setBounds(10, 400, 70, 50);
        c.add(b1);
        p1.add(b1);

        b2 = new JButton("Next");
        b2.setBounds(80, 400, 70, 50);
        c.add(b2);
        p1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        Images();

    }

    public void Images() {
        p2.add(l1);
        p2.add(l2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            cd.next(p2);
        } else if (e.getSource() == b1) {
            cd.previous(p2);
        }
        if (e.getSource() == ab11) {

            row1[0] = ft11.getText();
            row1[1] = lt12.getText();
            row1[2] = pt13.getText();
            row1[3] = gt14.getText();

            mo1.addRow(row1);

        } else if (e.getSource() == cb14) {

            ft11.setText("");
            lt12.setText("");
            pt13.setText("");
            gt14.setText("");
        } else if (e.getSource() == db13) {

            int numR = ta1.getSelectedRow();

            if (numR >= 0) {
                mo1.removeRow(numR);
            } else {
                JOptionPane.showMessageDialog(null, "No row has selected");
            }

        } else if (e.getSource() == ub12) {

            int numR = ta1.getSelectedRow();

            String fn = ft11.getText();
            String ln = lt12.getText();
            String ph = pt13.getText();
            String gpa = gt14.getText();

            mo1.setValueAt(fn, numR, 0);
            mo1.setValueAt(ln, numR, 1);
            mo1.setValueAt(ph, numR, 2);
            mo1.setValueAt(gpa, numR, 3);

        } else if (e.getSource() == Calculate1) {
            
             CGPA1();
        }

    }

    public static void main(String[] args) {
        MYProject01 f = new MYProject01();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(00, 00, 1000, 700);
        f.setTitle("CGPA ");
    }

    public void label01() {

        head1 = new JLabel("         INFORMATION");
        head1.setBounds(250, 20, 300, 50);
        head1.setFont(f1);
        c.add(head1);
        p2.add(head1);
        l1.add(head1);

        l11 = new JLabel("Course code ");
        l11.setBounds(50, 80, 150, 30);
        l11.setFont(f2);
        c.add(l11);
        p2.add(l11);
        l1.add(l11);

        l12 = new JLabel("Course Title ");
        l12.setBounds(50, 130, 150, 30);
        l12.setFont(f2);
        l1.add(l12);

        l13 = new JLabel("Credit     ");
        l13.setBounds(50, 180, 150, 30);
        l13.setFont(f2);
        c.add(l13);
        l1.add(l13);

        l14 = new JLabel("GPA    ");
        l14.setBounds(50, 230, 150, 30);
        l14.setFont(f2);
        c.add(l14);
        l1.add(l14);

        ft11 = new JTextField("0");
        ft11.setBounds(150, 80, 250, 30);
        ft11.setFont(f2);
        l1.add(ft11);

        lt12 = new JTextField();
        lt12.setBounds(150, 130, 250, 30);
        lt12.setFont(f2);
        l1.add(lt12);

        pt13 = new JTextField();
        pt13.setBounds(150, 180, 250, 30);
        pt13.setFont(f2);
        l1.add(pt13);

        gt14 = new JTextField();
        gt14.setBounds(150, 230, 250, 30);
        gt14.setFont(f2);
        l1.add(gt14);

        ab11 = new JButton("Add");
        ab11.setBounds(450, 80, 100, 30);
        ab11.setFont(f2);
        l1.add(ab11);

        ub12 = new JButton("Update");
        ub12.setBounds(450, 130, 100, 30);
        ub12.setFont(f2);
        l1.add(ub12);

        db13 = new JButton("Delete");
        db13.setBounds(450, 180, 100, 30);
        db13.setFont(f2);
        l1.add(db13);

        cb14 = new JButton("Clear");
        cb14.setBounds(450, 230, 100, 30);
        cb14.setFont(f2);
        l1.add(cb14);

        Calculate1 = new JButton("Calculate CGPA");
        Calculate1.setBounds(300, 300, 150, 50);
        Calculate1.setFont(f2);
        l1.add(Calculate1);
        
        
        ta1 = new JTable();
        
        mo1 = new DefaultTableModel();
        mo1.setColumnIdentifiers(col1);
       
        ta1.setModel(mo1);
        ta1.setFont(f2);
        ta1.setSelectionBackground(Color.GREEN);
        ta1.setBackground(Color.WHITE);
        ta1.setRowHeight(30);

//        ta.setEnabled(false);
        sp1 = new JScrollPane(ta1);
        sp1.setBounds(10, 360, 740, 230);
        l1.add(sp1);

        ab11.addActionListener(this);ub12.addActionListener(this);db13.addActionListener(this);
        cb14.addActionListener(this);
        
        
        Calculate1.addActionListener(this);

        ta1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent m) {
                int numR = ta1.getSelectedRow();

                String fn = mo1.getValueAt(numR, 0).toString();
                String ln = mo1.getValueAt(numR, 1).toString();
                String ph = mo1.getValueAt(numR, 2).toString();
                String gpa = mo1.getValueAt(numR, 3).toString();

                ft11.setText(fn);
                lt12.setText(ln);
                pt13.setText(ph);
                gt14.setText(gpa);

            }
        });

    }


    public void CGPA1(){
        double Ccreadet = 0, Cnum,Pnum ,total=0;
        int  Ci = 0,Pj=0;
            String Cnum2,Pnum2;
            int Cn= mo1.getRowCount();
            Cnum2 = mo1.getValueAt(0, 2).toString();
            Pnum2 = mo1.getValueAt(0, 3).toString();
            Cnum = Double.parseDouble(Cnum2);
            Pnum = Double.parseDouble(Pnum2);
//            
            while (Cn > Ci) {
                Ccreadet =Ccreadet + Cnum;
                total += Cnum * Pnum;
                
                Ci++;Pj++;
                if(Ci==Cn){
                   break; 
                }
                Cnum2 = mo1.getValueAt(Ci, 2).toString();
                Cnum = Double.parseDouble(Cnum2);
                
                Pnum2 = mo1.getValueAt(Pj, 3).toString();
                Pnum = Double.parseDouble(Pnum2);
                
                
            }
            double ans = total/Ccreadet;
            JOptionPane.showMessageDialog(null, "YOUR CGPA is : "+ans);
            
            
            Ccreadet1.setText(""+Ccreadet);
            total1.setText(""+total);
       

    }

}
