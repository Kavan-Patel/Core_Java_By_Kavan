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
public class AccessSpecifire4_27 extends B2_AccessSpecifire1{
    void my_mthod()
    {
        System.out.println(a);
//        System.out.println(b);//This is default
//        System.out.println(c);//This is private
        System.out.println(d);
    }
    public static void main(String[] args) {
       AccessSpecifire4_27 obj1=new AccessSpecifire4_27();
       obj1.my_mthod();
    }
}
