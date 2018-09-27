/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author kavan
 */
class x
{
    int a=45;
    void fun()
    {
        System.out.println("This is fun class");
    }
}
class y extends x
{
    int b=22;
    
    void fun2()
    {
        
        System.out.println("This is fun 2 and a="+a);
    }
}
class z extends y
{
    int c=33;
    void fun3()
    {
        System.out.println("This is fun 3 and b="+b);
    }
}
public class MultiLevelInheritance_41 {
    public static void main(String[] args) {
        z obj=new z();
        obj.fun3();
        obj.fun2();
        obj.fun();
    }
}
