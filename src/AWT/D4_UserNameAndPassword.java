/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kavan
 */
public class D4_UserNameAndPassword extends Frame implements ActionListener{
    Label lbname=new Label("Name");
    Label lbuser=new Label("UserName");
    Label lbpass=new Label("Password");
    TextField tfname=new TextField(10);
    TextField tfuser=new TextField(10);
    TextField tfpass=new TextField(10);
    Button btok=new Button("OK");
    Button btcan=new Button("Cancel");
    Button btres=new Button("Reset");
    FlowLayout fl=new FlowLayout();
    
    D4_UserNameAndPassword()
    {
        setLayout(fl);
        add(lbname);
        add(tfname);
        tfname.addActionListener(this);
        add(lbuser);
        add(tfuser);
        tfuser.addActionListener(this);
        add(lbpass);
        add(tfpass);
        tfpass.addActionListener(this);
        add(btok);
        btok.addActionListener(this);
        add(btres);
        btres.addActionListener(this);
        add(btcan);
        btcan.addActionListener(this);
        setSize(500, 500);
        show();
       
    }
    public static void main(String[] args) {
        D4_UserNameAndPassword obj=new D4_UserNameAndPassword();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btok)
        {
            if("kavan".equals(tfuser.getText())&&"Yashvi".equals(tfpass.getText()))
            {
                setBackground(Color.green);
            }
        }
        else if(e.getSource()==btcan)
        {
            setBackground(Color.red);
        }
        else if(e.getSource()==btres)
        {
            tfname.setText(null);
            tfuser.setText(null);
            tfpass.setText(null);
            setBackground(Color.gray);
            
        }
    }
}
