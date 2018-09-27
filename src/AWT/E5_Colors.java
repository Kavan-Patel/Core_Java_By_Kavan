/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kavan
 */
public class E5_Colors extends Frame implements ActionListener{
    Button bt1=new Button("Red");
    Button bt2=new Button("Blue");
    Button bt3=new Button("Yellow");
    Button bt4=new Button("Green");
    FlowLayout fl=new FlowLayout();
    TextField tf=new TextField(100);
    E5_Colors()
    {
        setLayout(fl);
        add(bt1);
        bt1.addActionListener(this);
        add(bt2);
        bt2.addActionListener(this);
        add(bt3);
        bt3.addActionListener(this);
        add(bt4);
        bt4.addActionListener(this);
        add(tf);
        tf.addActionListener(this);
        setSize(500, 500);
        show();
    }
    public static void main(String[] args) {
        E5_Colors obj=new E5_Colors();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1)
        {
            setBackground(Color.red);
            tf.setBackground(Color.cyan);
        }
        else if(e.getSource()==bt2)
        {
            setBackground(Color.BLUE);
            tf.setBackground(Color.MAGENTA);
        }
        else if(e.getSource()==bt3)
        {
            setBackground(Color.yellow);
            tf.setBackground(Color.red);
        }
        else if(e.getSource()==bt4)
        {
            setBackground(Color.green);
            tf.setBackground(Color.ORANGE);
        }
    }
    
}
