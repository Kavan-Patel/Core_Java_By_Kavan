/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Thread;

/**
 *
 * @author kavan
 */
class Threaddemo extends Thread
{
    String str="";
    Threaddemo(String s)
    {
        str=s;
        start();        //For invoking run method the obj of thread required 
       //THis obj can be obtain by creating and initiating a thread using the start() method
        System.out.println("tHIS IS is after start");
    }
    @Override
    public void run()           //run method invoke by the start method
    {
        System.out.println(str);
    }
}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        Threaddemo td=new Threaddemo("One Thread Crated");
    }
}
