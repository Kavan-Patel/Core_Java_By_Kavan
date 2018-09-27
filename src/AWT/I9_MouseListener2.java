/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author kavan
 */
public class I9_MouseListener2 extends Frame implements MouseListener{

    Label lb=new Label("This is label");
    GridLayout gd=new GridLayout(3,3);
    
    I9_MouseListener2()
    {
        setLayout(gd);
        add(lb);
        lb.addMouseListener(this);
//        addMouseListener(this);
        setSize(500, 500);
        show();
    }
    public static void main(String[] args) {
        I9_MouseListener2 obj=new I9_MouseListener2();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.yellow);
        lb.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.green);
        lb.setText("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.blue);
        lb.setText("mouse Relesed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.MAGENTA);
        lb.setText("mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.LIGHT_GRAY);
        lb.setText("mouseExited");
    }
    
}
