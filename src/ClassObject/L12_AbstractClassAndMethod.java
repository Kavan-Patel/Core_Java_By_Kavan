/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package ClassObject;

/**
 *
 * @author kavan
 */
abstract class ax
{
    ax()        //Constructor is not possible in interface 
    {
        
    }
    abstract void display();
   static void d()
    {
        
    }
    int x;      //we can not write in interface without initialization
}
class bby extends ax
{
   @Override
   void display()   //in abstract public is not compolsory
   {
       System.out.println("This is abstract method");
   }
}

public class L12_AbstractClassAndMethod {
//    ax obj=new ax();  //this is not possible because abstaract class can not be initiate with obj memory
    public static void main(String[] args) {
    ax obj=new bby();
    bby obj2=new bby();
    obj2.display();
obj.display();
    }
}
//interface is 100%pure abstract and public 
//but abstract class has some concentrate method
//we can not declare abstract method as static,final,nativ,syncronized