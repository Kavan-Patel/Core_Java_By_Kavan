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
class a
{
    int a=45;
    void fun()
    {
        System.out.println("This is class a");
    }
}
class b extends a
{
    
    void fun2()
    {
        System.out.println("A="+a);
        System.out.println("This is class b");
    }
}
public class SimpleOrSingleLevelInheritance_40 {
    public static void main(String[] args) {
        b obj=new b();
        obj.fun2();
    }
}
