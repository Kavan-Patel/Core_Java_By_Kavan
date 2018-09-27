/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
public class book7_20 {
    public static void main(String[] args) {
        B s=new B();
        A t1=new A(s,"{");
        A t3=new A(s,"}");
        A t2=new A(s,"India");
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(5);
    }
 
}
class A extends Thread
{
    B s;
    A(B s,String str)
    {
        super(str);
        this.s=s;
        start();
    }
    public void run()
    {
        try {
            s.display(Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class B 
{
    public synchronized void display(String str) throws InterruptedException
    {
        for (int i = 0; i < 3; i++) {
            System.out.print(str);
            Thread.sleep(100);
        }
    }
}
