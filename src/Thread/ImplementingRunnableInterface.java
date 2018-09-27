/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Thread;



/**
 *
 * @author kavan
 */
class Threaddemoo implements Runnable
{
   
    String str="";
    Threaddemoo(String s)
    {
       Thread t=new Thread(this);     //if i dont write 'this' in thread then run method does not invoke also object is not created.
        str=s;
        t.start();//start is in thread class
    }
    @Override
    public void run() {
        System.out.println("jfldjskfsj");
    }

}
public class ImplementingRunnableInterface{
    public static void main(String[] args) {
        Threaddemoo obj=new Threaddemoo("One Thread is crated");
    }
}
