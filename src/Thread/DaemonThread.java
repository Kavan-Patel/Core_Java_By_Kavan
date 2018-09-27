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
class myDaemon implements Runnable
{
    
    myDaemon()
    {
       Thread t=new Thread(this);
        t.setDaemon(true);
        t.start();
    }
    @Override
    public void run() {
        while(true)
        {
            try {
                System.out.println("\n*");
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(myDaemon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        myDaemon md=new myDaemon();
        Thread td=new Thread();
        System.out.println("Daemon Thead is started");
        td.sleep(1000);
        System.out.println("Main thread ending");
    }
}
