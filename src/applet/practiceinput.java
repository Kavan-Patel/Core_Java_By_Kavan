/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kavan
 */
public class practiceinput extends Applet {
     TextField tf1,tf2;
     Button ad,sb;
     @Override
    public void init()
    {
        tf1=new TextField(8);
        tf2=new TextField(8);
        ad=new Button("Addition");
        sb=new Button("Substraction");
        add(tf1);
        add(tf2);
        add(ad);
        add(sb);
        ad.setBackground(Color.yellow);
        sb.setBackground(Color.yellow);
        tf1.setText("0");
        tf2.setText("0");
        setBackground(Color.lightGray);
    }
    @Override
    public void paint(Graphics g)
    {
        int i,j,k,l;
        String s,s1,s2,s3;
        g.drawString("Input a number in each box", 101, 50);
        
        s1=tf1.getText();
        i=Integer.parseInt(s1);
        s2=tf2.getText();
        j=Integer.parseInt(s2);
        k=i+j;
        l=i-j;
        s=String.valueOf(k);
        s3=String.valueOf(l);
       ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.drawString("The sum is", 100, 100);
                g.drawString(s, 230, 100);
            }
        });
       sb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 g.drawString("The sub is", 100, 100);
                g.drawString(s3, 230, 100);
            }
        });
        
       
    }
//     @Override
//    public boolean action(Event event,Object obj)
//    {
////        repaint();  //This method is use for updating graphics
//        return true;
//    }
}
