/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author kavan
 */

//in inheritance there are only one superclass two or more superclass are not possible
//thus java has feature like interface which support one or more super class so we can implement multiple inheritance
//In interface There is no any body part of method
//there is no concept of objects in interface
//there is one class must be compolsory for implementing methods of interface
//if there is parent is interface and child is class then use implement otherwise extends
//methods of interface is called abstract methods
//Abstract method means a method which have no any body part is called abstract method
//we learn abstract method in further programs
//we cannot make constructor in interface
interface Area
{
//    int x;     //in interface variable must be initialize
   int code=3333;
   float pi=3.14F;
   float compute(float x,float y);
   void show();
}

class ab implements Area
{

    

    @Override
    public float compute(float x, float y) {
       float ans;
       ans=x*y;
       return ans;
    }

    @Override
    public void show() {
        System.out.println(compute(code,pi));
    }
    
}
public class definingSimpleInterface_44 {
    public static void main(String[] args) {
        ab obj=new ab();
        
        System.out.println(obj.compute(23,24));
        obj.show();
    }
}
