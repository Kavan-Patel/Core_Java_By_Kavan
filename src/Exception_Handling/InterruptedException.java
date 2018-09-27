/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
class MyThread implements Runnable
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Started");
        
        try {
            System.out.println("This is method");
            Thread.sleep(10000);
            for (int i = 1; i < 10; i++) {
                if(Thread.interrupted())
                {
                    System.out.println("interrupted");
                    break;
                }
            }
        } catch (java.lang.InterruptedException ex) {
            System.out.println(Thread.currentThread().getName()+" interrupted");
        }
        System.out.println(Thread.currentThread().getName()+"Stopped");
    }

}
public class InterruptedException {
    public static void main(String[] args) throws java.lang.InterruptedException {
        Thread t1=new Thread(new MyThread(), "Thread #1");
        Thread t2=new Thread(new MyThread(), "Thread #2");
        Thread t3=new Thread(new MyThread(), "Thread #3");
        t1.start();
        System.out.println("before wait");
        Thread.sleep(10000);
               System.out.println("wait 10000 mili sec");
        t1.interrupt();
        t2.start();
        Thread.sleep(3000);
        t2.interrupt();
        t3.start();
        Thread.sleep(2000);
        t3.interrupt();
    }
}
