/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author kavan
 */
public class KeyboardEvent extends Applet implements KeyListener {

    @Override
    public void init()
    {
        addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        showStatus("dfd"+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("A key on the keyboard is pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("key on the keyboard is relesed");
    }
    Font f1=new Font("Courier New",Font.BOLD,20);
    @Override
    public void paint(Graphics g)
    {
        g.setFont(f1);
        g.setColor(Color.red);
        g.drawString("This applet sense the up/down motion of keys", 20, 120);
    }
    
}
