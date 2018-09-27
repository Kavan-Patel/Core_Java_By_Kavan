/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author kavan
 */
public class ConvertTemperatureValue extends Applet implements AdjustmentListener{
    private Scrollbar br;
    private int old,newtemp=0;
    private int fahr=32;
    public void init()
    {
        br=new Scrollbar(Scrollbar.HORIZONTAL,1, 1, 0, 101);
        br.addAdjustmentListener(this);
        setLayout(new BorderLayout());
        add("North",br);
    }
    public void paint(Graphics g)
    {
        g.drawString("Celsius="+newtemp, 30, 50);
        g.drawString("Fahrenheit="+fahr, 30, 70);
    }
    
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        newtemp=br.getValue();
        if(newtemp!=old)
        {
            fahr=newtemp*9/5+32;
            old=newtemp;
        }
    }
    
}
