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
class aa
{
    int fun()
    {
        int a=2,b=4;
        int s=a+b;
        return s;
    }
//    void fun()
//    {
//        System.out.println("This is not possible return type not count");
//    }
    void fun(int i)
    {
        System.out.println("This is fun method and i="+i);
    }
    void fun(int i,int j)
    {
        System.out.println("i = "+i+" j = "+j);
    }
    void fun(double d)
    {
        System.out.println("double d = "+d);
    }
}
public class F6_MethodOverLoding {
    
    public static void main(String[] args) {
        aa obj=new aa();
        System.out.println(obj.fun());
//        System.out.println(obj.fun(45));//This is not possible because void does not return anything

        obj.fun(22.23);
        obj.fun(45);
        obj.fun(00, 33);
        obj.fun(45.66);
    }
    
}
