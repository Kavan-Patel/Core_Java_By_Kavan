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
class xy
{
    void fun()
    {
        System.out.println(" This is fun method");
    }
    int i=20;
    static int b=45;
    static void fun1()
    {
//        int b=90;
        System.out.println("This is static method and b="+b);
    }
}
public class D4_AccessClassMemberAndMethods {
    public static void main(String[] args) {
        xy obj=new xy();
        obj.fun();
        System.out.println("i="+obj.i);
        obj.fun1();
        xy.fun1();
        System.out.println("b="+xy.b);
    }
}
