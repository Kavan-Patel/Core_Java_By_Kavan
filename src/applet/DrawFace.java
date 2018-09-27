/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author kavan
 */
public class DrawFace extends Applet{
    @Override
    public void paint(Graphics g)
    {
        g.fillOval(200, 100, 30, 30);
        g.fillOval(100, 100, 30, 30);
        g.drawOval(100, 100, 150, 150);
        g.drawOval(130, 130, 30, 40);
        g.drawOval(135, 130, 15, 15);
        g.drawOval(200, 130, 15, 15);
        g.drawOval(190, 130, 30, 40);
        g.fillArc(150, 130, 50, 100, 180, 180);
    }
    @Override
    public void init()
    {
        
    }
}
