/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryBasic_1_to_22;

/**
 *
 * @author kavan
 */
class bcd
    {
        int i=20; // class variable
        char c='d';
        void fun()
        {
            int i=10;//local variable
            System.out.println("i local="+i);
        }
    }
public class F6_instanceLocalClassStaticVariable {
   static int i=30;  //static variable
    static void fun1()
    {
        System.out.println("i static variable"+i);
    }
    public static void main(String[] args) {
        int i=45;       //instance variable
        bcd obj=new bcd();
        System.out.println("i class variable="+obj.i);
        System.out.println(obj.c);
        System.out.println("i instance variable="+i);
        fun1();
        obj.fun();
    }
}
