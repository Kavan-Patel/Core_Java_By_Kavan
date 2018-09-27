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
class Thread_demoo implements Runnable
{
    String msg="";
    Thread_demoo(String str)
    {
        Thread t=new Thread(this);
        msg=str;
        t.start();
    }
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_demoo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
public class creationofMultiyThreadingByimplementingRunnable {
    public static void main(String[] args) {
        Thread_demoo d1=new Thread_demoo("First Thread");
        Thread_demoo d2=new Thread_demoo("Second Thread");
        Thread_demoo d3=new Thread_demoo("Thired Thread");
    }
}
