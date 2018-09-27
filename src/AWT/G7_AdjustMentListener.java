/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author kavan
 */
public class G7_AdjustMentListener extends Frame implements AdjustmentListener{
    Label lred=new Label("red");
    Label lblue=new Label("blue");
    Label lgreen=new Label("green");
    Label lrgb=new Label("RGB");
    Scrollbar scred=new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 0, 255);
    Scrollbar scblue=new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 0, 255);
    Scrollbar scgreen=new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 0, 255);
    Scrollbar scrgb=new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 0, 255);
    GridLayout gd=new GridLayout(8,1,2,2);
    
    G7_AdjustMentListener()
    {
        
        add(scred);
        scred.addAdjustmentListener(this);
        add(lred);
        add(scblue);
        scblue.addAdjustmentListener(this);
        add(lblue);
        add(scgreen);
        scgreen.addAdjustmentListener(this);
        add(lgreen);
        add(scrgb);
        scrgb.addAdjustmentListener(this);
        add(lrgb);
        setSize(900, 900);
        show();
        setLayout(gd);
    }
    public static void main(String[] args) {
        G7_AdjustMentListener obj=new G7_AdjustMentListener();
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r=scred.getValue();
        int g=scgreen.getValue();
        int b=scblue.getValue();
//        int rgb=scrgb.getValue();
        Color cb=new Color(0, 0, b);
        Color cg=new Color(0, g, 0);
        Color cr=new Color(r, 0, 0);
        Color crgb=new Color(r, g, b);
        lblue.setBackground(cb);
        lred.setBackground(cr);
        lgreen.setBackground(cg);
        lrgb.setBackground(crgb);
    }
    
}
