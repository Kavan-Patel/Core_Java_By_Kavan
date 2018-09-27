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

//Method overriding is used in inheritance

class cy
{
    void fun()
    {
        System.out.println("THis is super class");
    }
}
class by extends cy
{

  //  @Override
    void fun()
    {
        System.out.println("This is sub class");
    }
}
public class G7_MethodOverRidding {
    public static void main(String[] args) {
        cy objcy=new cy();
        by objby=new by();
        objby.fun();   ///This called method of sub class
        objcy.fun();    ///This called method of super class
        
    }
    
}
