/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author kavan
 */
public class B2_AWTControls extends Frame {
    Label lbname=new Label("Name");
    Label lbaddr=new Label("Address");
    Label lbmaths=new Label("maths");
    Label lbscience=new Label("science");
    Label lbenglish=new Label("english");
    Label lbtot=new Label("total");
    TextArea txtaddr=new TextArea("Address", 15, 45);
    TextField tfname=new TextField(20);
    TextField tfmaths=new TextField(5);
    TextField tfscience=new TextField(5);
    TextField tfenglish=new TextField(5);
    TextField tftot=new TextField(5);
    Choice ch=new Choice();
    List lis=new List();
    Button btok=new Button("OK");
    Button btnreset=new Button("RESET");
    Button btncan=new Button("CANCEL");
    FlowLayout fl=new FlowLayout();
    B2_AWTControls()
    {
//        super(s);
        add(lbname);
        add(tfname);
        add(lbaddr);
        add(txtaddr);
        add(lbmaths);
        add(tfmaths);
        add(lbscience);
        add(tfscience);
        add(lbenglish);
        add(tfenglish);
        add(lbtot);
        add(tftot);
        ch.add("Physics");
        ch.add("Chemistry");
        ch.add("Maths");
        ch.add("Computer");
        ch.add("Biology");
        add(ch);
        lis.add("music");
        lis.add("Drama");
        lis.add("Dance");
        lis.add("Martial arts");
        lis.add("Writing");
        add(lis);
        add(btok);
        add(btnreset);
        add(btncan);
        setLayout(fl);
        setSize(700, 500);
//        show();
    }
    public static void main(String[] args) {
        B2_AWTControls obj=new B2_AWTControls();
        obj.show();
    }
}
