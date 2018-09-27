/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Exception_Handling;

/**
 *
 * @author kavan
 */
class Ex 
{
  static void fun(int b[]) throws Exception
  {
      int c;
      c=b[0]/b[2];
  }
}
public class UncaughtException {
    public static void main(String[] args) {
        
        int a[]={20,56,45};
        try{
        Ex.fun(a);
        }catch(Exception e)
        {
            System.out.println("This is erorr0"+e);
        }
        
    }
}
