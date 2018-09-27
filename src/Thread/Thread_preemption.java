/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Thread;

/**
 *
 * @author kavan
 */
class a extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread #1");
        for (int i = 1; i <=5; i++) {
            System.out.println("\tA:"+i);
        }
        System.out.println("\n---------End of Thread #1-----------\n");
    }
}
class b extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread #2");
        for (int i = 1; i <=5; i++) {
            System.out.println("\tB:"+i);
        }
        System.out.println("\n---------End of Thread #2-----------\n");
    }
}
public class Thread_preemption {
    public static void main(String[] args) {
        a obja=new a();
        b objb=new b();
        
        obja.setPriority(1);
        objb.setPriority(4);
        
        System.out.println("Strting thread #1");
        obja.start();
        System.out.println("Strting thread #2");
        objb.start();
        
        System.out.println(obja.getPriority());
        System.out.println(objb.getPriority());
    }
}
