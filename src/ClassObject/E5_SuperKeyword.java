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
class ad
{
    ad()
    {
       System.out.println("TIhis is ad constructor");
    }
   ad(int a)
    {
        System.out.println("This is super class a"+a);
    }
    int sum()
    {
        int i=10,j=20;
        int ans;
        ans=i+j;
        return ans;
    }
    
}
class cd extends ad
{
   cd()
   {
       
       //if parameterized constructor in parents class then super keyword is used
       //if we wish to use method of super class in sub class then super keyword is used
//       super();
             // super(10);    //we can call only one constructor of parents class and if there is two constructor in super class then super key word is used
       System.out.println("Here method is called of super class and ans ="+super.sum());      
       System.out.println(sum());
       
       System.out.println("This is cd constructor");
   }
}
public class E5_SuperKeyword extends cd {
  
    public static void main(String[] args) {
        cd obj=new cd();
        
        

    }
}
// if you have to call explicitely the super class constructor to pass it some parameters: