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
class thiss
{
    void fun()
    {
        System.out.println("This is thiss class");
    }
}
class news extends thiss
{
    void fun()
    {
        System.out.println("THis is news");
    }
}
public class A1_ObjectCreation {
     public static void main(String[] args) {
        thiss obj=new thiss();
        thiss obj1=new news();
//        news obj2=(news) new thiss();

        obj.fun();
        obj1.fun();
//        obj2.fun();
              
    }
}
//explain obj in details in interface
