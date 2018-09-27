/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

/**
 *
 * @author kavan
 */
public class GettingInputFromUser extends Applet{
     TextField tf1,tf2;
     @Override
    public void init()
    {
        tf1=new TextField(8);
        tf2=new TextField(8);
        add(tf1);
        add(tf2);
        tf1.setText("0");
        tf2.setText("0");
        setBackground(Color.lightGray);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString(tf1.toString(), 566, 566);
        int i,j,k;
        String s,s1,s2;
        g.drawString("Input a number in each box", 101, 50);
        tf1.setBackground(Color.ORANGE);
        tf2.setBackground(Color.ORANGE);
        s1=tf1.getText();
        i=Integer.parseInt(s1);
        s2=tf2.getText();
        j=Integer.parseInt(s2);
        k=i+j;
        s=String.valueOf(k);
        g.drawString("The sum is", 100, 100);
        g.drawString(s, 230, 100);
       
    }
     @Override
    public boolean action(Event event,Object obj)
    {
        repaint();  //This method is use for updating graphics
        return false;
    }
}
