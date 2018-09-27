package Thread;

/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */

/**
 *
 * @author kavan
 */
class FirstThread extends Thread
{
    @Override
    public void run()   //Genrating Numbers
    {
        int i;
        System.out.println("\n Genrating Numbers");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
class SecondThread extends Thread
{
    @Override
    public void run()    //Displaying the numbers divisible by five
    {
        int i;
        System.out.println("\nDevisible by five");
        for (int j = 0; j < 10; j++) {
            if(j%5==0)
            {
                System.out.println(j);
            }
        }
    }
}
    class ThirdThread extends Thread
    {
        @Override
        public void run()           //prime numbers
        {
            int i,j,l;
            System.out.println("Prime numbers");
            for (j = 1; j <=10; j++) {
                
                for (l = 2; l <j; l++) {
                    int n=j%l;
                    if(n==0)
                    
                        break;
                    
                    
                }
                if(j==l)
                    {
                        System.out.println(j);
                    }
            }
        }
    }
class FourthThread extends Thread
{
    @Override
    public void run()
    {
        int i,sum;
        double avg;
        sum=0;
        System.out.println("Computing Avg");
        for (int j = 0; j <=10; j++) {
            sum=sum+j;
            avg=sum/(j-1);
            System.out.println(avg);
        }
    }
}
public class book7_15 {
    public static void main(String[] args) {
        FirstThread t1=new FirstThread();
        SecondThread t2=new SecondThread();
        ThirdThread t3=new ThirdThread();
        FourthThread t4=new FourthThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
