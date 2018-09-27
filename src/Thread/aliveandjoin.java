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

public class aliveandjoin extends Thread{
    public void run()
    {
        System.out.println("Thread 1");
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(aliveandjoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread 2");
    }
    public static void main(String[] args) {
       
            aliveandjoin t1=new aliveandjoin();
            aliveandjoin t2=new aliveandjoin();
            t1.start();
            t2.start();
            System.out.println("Thread one is alive"+t1.isAlive());
            System.out.println("Thread two is alive"+t2.isAlive());
            System.out.println("Waiting for thread to finish");
//             try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException ex) {
            System.out.println("Main thread interrrupted");
            System.out.println("Thread one is alive "+t1.isAlive());
            System.out.println("Thread two is alive "+t2.isAlive());
//        }
    }
}
