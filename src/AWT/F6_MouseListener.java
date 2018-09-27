/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author kavan
 */
public class F6_MouseListener extends Frame implements MouseListener{

    Label l1=new Label("Maths");
    Label l2=new Label("Science");
    Label l3=new Label("English");
    TextField tf1=new TextField(10);
    TextField tf2=new TextField(10);
    TextField tf3=new TextField(10);
    TextField tf4=new TextField(10);
    Button b1=new Button("Submit");
  
    Button b2=new Button("Avg");
    GridLayout g=new GridLayout(5,2);
    
    F6_MouseListener()
    {
        setLayout(g);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(tf4);
        add(b1);
        add(b2);
        b1.setVisible(false);
        b2.addMouseListener(this);
        show();
        setSize(500, 500);
    }
    public static void main(String[] args) {
        F6_MouseListener obj=new F6_MouseListener();
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
            String s1=tf1.getText();
            String s2=tf2.getText();
            String s3=tf3.getText();
            int maths=Integer.parseInt(s1);
            int science=Integer.parseInt(s2);
            int english=Integer.parseInt(s3);
            int avg=(maths+science+english)/3;
            
            if(avg>=75)
            {
                b1.setVisible(true);
                tf4.setText(avg+"");
                setBackground(Color.green);
            }
            else
            {
                tf4.setText("Sorry You Are Not Eligable");
                setBackground(Color.red);
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
