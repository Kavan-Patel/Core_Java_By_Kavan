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
class cyc
{
     int a;
    void fun()
    {
       
        System.out.println("THis is super class");
    }
    private void fun(int i)
    {
        a=i;
        System.out.println("parents i="+i);
    }
    void display()
    {
        fun(33);
        System.out.println("This is display");
    }
}
class byc extends cyc
{
    void fune()
    {
        System.out.println(a);
    }
    @Override
    void fun()
    {
        System.out.println(a);
        System.out.println("This is sub class");
    }
//    @Override
//    @Override
    void fun(int j)
    {
        System.out.println("Child j="+j);
    }
}

public class H8_MethodOverlodingAndOverRidding {
    public static void main(String[] args) {
        cyc objcyc=new cyc();
        byc objbyc=new byc();
        objbyc.fun();   ///This called method of sub class
        objcyc.fun();    ///This called method of super class
        objbyc.fun(45);
//        objcyc.fun(78);
        objcyc.display();
    }
}
