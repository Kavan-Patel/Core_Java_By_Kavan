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
public class simple_calculation_with_applet extends Applet {

    @Override
    public void start() {
    }

    @Override
    public void init() {
    }

    @Override

    public void paint(Graphics g) {
        int v1 = 10;
        int v2 = 20;
        int sum = v1 + v2;
        int sub = v1 - v2;
        String s = "sum::" + String.valueOf(sum);
        String p = "sub::" + String.valueOf(sub);
        g.drawString(s, 1000, 100);
        g.drawString(p, 100, 80);
    }

    @Override
    public void stop() {
    }

    @Override
    public void destroy() {
    }
}
