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


public class C3_AccessSpecifire2 {
    void my_method()
    {
        B2_AccessSpecifire1 obj=new B2_AccessSpecifire1();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);    //This is private
        System.out.println(obj.d);
        obj.fun();
        obj.fun2();
        obj.fun4();
//        obj.fun3();  ///This is private
    }
    public static void main(String[] args) {
       C3_AccessSpecifire2 obj1=new C3_AccessSpecifire2();
       obj1.my_method();
    }
}
