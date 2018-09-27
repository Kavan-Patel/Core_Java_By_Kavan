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
public class Chess extends Applet{
    @Override
    public void start()
    {}
    @Override
    public void init(){}
    @Override
    public void paint(Graphics g){
//        g.drawRect(150, 150, 50, 50);
g.setColor(Color.red);
        for (int i = 0; i <400; i+=100) {
            for (int j = 0; j <400; j+=100) {
               g.fillRect(i, j, 50, 50);
               g.drawRect(i, j, 50, 50);
                
            }
        }
        for (int i = 0; i < 400; i+=50) {
            for (int j = 0; j < 400; j+=50) {
                g.drawRect(i, j, 50, 50);
              
            }
        }
        for (int i = 50; i < 400; i+=100) {
            for (int j = 50; j < 400; j+=100) {
                g.fillRect(i, j, 50, 50);
                g.drawRect(i, j, 50, 50);
            }
            
        }
    }
    @Override
    public void stop(){}
    @Override
    public void destroy(){}
}
