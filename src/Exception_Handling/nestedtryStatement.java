/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

import java.util.Scanner;

/**
 *
 * @author kavan
 */
public class nestedtryStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int c=sc.nextInt();
//        int d=sc.nextInt();
        String s=sc.next();
        String j=sc.next();
        try
        {
        int a=Integer.parseInt(s);
        int b=Integer.parseInt(j);
        int ans=0;
         try
         {
           ans=a/b;
           System.out.println("ans= "+ans);
         }catch(ArithmeticException e)
         {
             System.out.println("Devide by zero Error");
         }
        }catch(NumberFormatException e)
        {
            System.out.println("Incorrect type of data");
        }
    }
        
}
