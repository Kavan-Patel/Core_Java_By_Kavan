/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotherpackage;

import ClassObject.B2_AccessSpecifire1;

/**
 *
 * @author kavan
 */
class a
{
    int p=30;
}
public class AccessSpecifire3_26 {
    void my_method()
    {
        B2_AccessSpecifire1 obj=new B2_AccessSpecifire1();
        System.out.println(obj.a);
//        System.out.println(obj.b);//This is default
//        System.out.println(obj.c);//This is private
//        System.out.println(obj.d);//Tihs is protected
    }
    public static void main(String[] args) {
        AccessSpecifire3_26 obj1=new AccessSpecifire3_26();
        obj1.my_method();
    }
 
}
