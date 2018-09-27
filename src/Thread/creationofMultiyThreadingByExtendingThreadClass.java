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
class Thread_demo extends Thread
{
    String str="";
    Thread_demo(String s)
    {
        str=s;
        start();
    }
    @Override
    public  void run()
    {
        for (int i = 1; i <=5; i++) {
            try {
                System.out.println(str);
                Thread.sleep(1000);
            } catch (Exception ex) {
                Logger.getLogger(Thread_demo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class creationofMultiyThreadingByExtendingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        Thread_demo d1=new Thread_demo("First Thead");
//        Thread.sleep(1000);
        Thread_demo d2=new Thread_demo("Second Thead");
//        Thread.sleep(2000);
        Thread_demo d3=new Thread_demo("Thired Thead");
       d1.join();
       d2.join();
       d3.join();
       /*
       join() is a instance method of java.lang.Thread class which we can use join() method to 
       ensure all threads that started from main must end in order in which they started and 
       also main should end in last. In other words waits for this thread to die. Exception: join() 
       method throws InterruptedException
       */
    }
}
