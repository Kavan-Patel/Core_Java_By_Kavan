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
class customException extends Exception{

    customException(String s) {
        System.err.println("customexcp : "+s);
    }
    static void fun() throws customException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%5==0)
        {
//            try {
                throw new customException("cannot enter value in multiple of 5");
//            } catch (customException ex) {
//                System.out.println("new");
//            }
        }else
        {
            System.out.println(n);
        }
    }
}
public class Custom_Excp {
    public static void main(String[] args) throws customException {
       customException.fun();
    }
    
}
