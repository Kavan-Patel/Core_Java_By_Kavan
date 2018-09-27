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
class c
{
        int i=20; // class variable
        public void fun()
        {
            int i=10;//local variable
            System.out.println("i local="+i);
        }
        static int p=30;  //static variable
        public static void fun1()//static method
        {
            System.out.println("i static variable"+p);
        }
}
public class H8_StaticKeyword {
    public void display1()
    {
        System.out.println("This is display method simple");
    }
    public static void display()
    {
        System.out.println("This is static display method");
    }
    public static void main(String[] args) {
        int i=45;  
        int p=45;//instance variable
        c obj=new c();
        System.out.println("i class variable="+obj.i);
        System.out.println("i instance variable="+i);
       
//        fun();
        obj.fun();
        obj.fun1();
        c.fun1();
//        c.fun();
}
}
