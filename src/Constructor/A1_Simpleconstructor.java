/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author kavan
 */
class a
{
    a()
    {
        System.out.println("This is simple constructor");
    }
    a(int x)
    {
        System.out.println("kdfjsdlkf"+x);
    }
    void display()
    {
        System.out.println("kdfjdlfk");
    }
}
class b extends a
{
    b(int y)
    {
//        super();
      super(33);
        System.out.println(" This is constructor of class b"+y);
    }
}
public class A1_Simpleconstructor {
    public static void main(String[] args) {
//      a obj=new a();
//        a obj1=new a(55);
   a obj2=new a(52);
   a obj1=new a();
   b ob=new b(44);
   obj2.display();
   obj1.display();
   ob.display();
  
    }
}
