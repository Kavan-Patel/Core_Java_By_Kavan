/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author kavan
 */
public class H8_KeyListener extends Frame implements KeyListener{

    Label ls=new Label("String");
    Label lc=new Label("CLONE");
    TextArea tas=new TextArea(5, 10);
    TextArea tac=new TextArea(5, 10);
    GridLayout gd=new GridLayout(4, 1);
    
    H8_KeyListener()
    {
        setLayout(gd);
        add(ls);
        add(tas);
        tas.addKeyListener(this);
        add(lc);
        add(tac);
        tac.addKeyListener(this);
        show();
        setSize(700, 700);
    }
    public static void main(String[] args) {
        H8_KeyListener obj=new H8_KeyListener();
    }
    @Override
    public void keyTyped(KeyEvent e) {
//        tac.setText(tas.getText());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
//         tac.setText(tas.getText());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       tac.setText(tas.getText());
    }
    
}
