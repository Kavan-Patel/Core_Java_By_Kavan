/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassObject;

/**
 *
 * @author kavan
 */
class maths
{
    int k=23;
    static int p=33;
    void fun()
    {
        System.out.println("This is fun method");
    }
    static void fun1()
    {
        System.out.println("This si fun method");
    }
    static double mul(double x,double y)
    {
//        System.out.println(k);   ///it can not use nonstatic member
        System.out.println(p);
        return x*y;
    }
    
    static double div(double x,double y)
    {
//        fun();     //it can only call static method
        fun1();
        return x/y;
    }
    
}
public class J10_StaticAndNestingMethod {
    public static void main(String[] args) {
        double a=maths.div(56, 32);
        double b=maths.mul(34, 3);
        System.out.println("div="+a);
        System.out.println("mul="+b);
        
    }
}
