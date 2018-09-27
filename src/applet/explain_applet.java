/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author kavan
 */
/*
applet is a java code which is run inside in a browser

*/
public class explain_applet extends Applet{
    @Override
    public void start()
    {
        
    }
    @Override
    public void init()
    {
        setBackground(Color.red);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString("hellow yashvi", 100, 20);
    }
    @Override
    public void stop()
    {
        
    }
    @Override
    public void destroy()
    {
        
    }
}
