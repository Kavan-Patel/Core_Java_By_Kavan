/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kavan
 */
public class C3_ActionListener extends Frame implements ActionListener {

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
    Frame f=new Frame("new frame");
    Panel p=new Panel();
    FlowLayout fl=new FlowLayout();
    C3_ActionListener(String s)
    {
//        super(s);
        add(lbname);
        add(tfname);
        tfname.addActionListener(this);
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
        btnreset.addActionListener(this);
        add(btncan);
        btncan.addActionListener(this);
        setLayout(fl);
        setSize(700, 500);
        f.show();
        p.show();
        p.setSize(500, 500);
        f.setSize(500, 300);
        setTitle(s);
        
//        show();
    }
    public static void main(String[] args) {
        C3_ActionListener obj=new C3_ActionListener("this is");
        
        obj.show();
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=null;
        if(e.getSource()==btnreset)
        {
            tfname.setText("Kavan");
            lis.select(1);
            s1=tfname.getText();
            ch.select("Computer");
        }
        else if(e.getSource()==btncan)
        {
            
            setBackground(Color.red);
            System.exit(0);
        }
        System.out.println(s1);
    }
}
