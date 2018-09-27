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
class one implements Runnable{
 
    one()
    {
        new Thread(this,"one").start();
    }
    @Override
    public void run() {
        for (;;)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(one.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Good Morning");
        }
    }
    
}
class two implements Runnable{
 
    two()
    {
        new Thread(this,"two").start();
    }
    @Override
    public void run() {
        for (;;)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(one.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Good Afternoon");
        }
    }
    
}
public class book7_23 {
    public static void main(String[] args) {
        one obja=new one();
        two objb=new two();
    }
}
