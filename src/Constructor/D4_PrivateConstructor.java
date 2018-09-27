/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

//import static Constructor.dd.fun;

/**
 *
 * @author kavan
 */
class dd
{
    private dd()
    {
        System.out.println("This is private constroctor");
    }
   public static void fun()
    {
        dd obj = new dd();
    }
}
class pp 
{
    pp()
    {
//        super();
        System.out.println("This is subclass constroctor");
    }
}
public class D4_PrivateConstructor {
    public static void main(String[] args) {
        pp obj=new pp();
//        dd obj1=new dd();
        dd.fun();
    }
    
}
//private constroctor is use of prevatation of creating obj
//you can still create obj of private constroctor with using static class
//in above example i explain and this is imosst imp question of interview
