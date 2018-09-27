/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

/**
 *
 * @author kavan
 */
public class throwsException {
    static void fun(int a,int b) throws ArrayIndexOutOfBoundsException
        {
            int c[]=new int[2];
//            try{
//                c=a/b;
                System.out.println(c[1]);
//            }
//            catch(ArithmeticException e)
//            {
//                System.out.println("this is an exception "+e);
//            }
        }
  
    public static void main(String[] args) {
        int a=5;
//        try
//        {
        fun(a,0); 
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("handel");
//        }
    }
    
}
