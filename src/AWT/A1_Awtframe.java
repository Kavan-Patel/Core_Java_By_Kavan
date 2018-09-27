/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author kavan
 */
public class A1_Awtframe extends Frame{
    Label lbname=new Label("Name");
    TextField txtname=new TextField(10);
    Label lbladdr=new Label("Address");
    TextArea taaddr=new TextArea("Address", 4, 20);
    FlowLayout fl=new FlowLayout();
    A1_Awtframe()
    {
        add(lbname);
        add(txtname);
        add(lbladdr);
        add(taaddr);
        setLayout(fl);
        setSize(700, 500);
        show();
    }
    public static void main(String[] args) {
        A1_Awtframe obj=new A1_Awtframe();
    }
}
