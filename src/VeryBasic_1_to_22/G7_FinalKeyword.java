/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryBasic_1_to_22;

/**
 *
 * @author kavan
 */

final class x
{
    void display()
    {
        System.out.println("This is final class");
    }
}
//class y extends x     //THis is not possible because class x is final
//{
//    int i=45;
//}
public class G7_FinalKeyword {
   static final int i=10;
 // initialize is must be compolsory  final int s;
   static int j=20;
 int o=45;
    public static void main(String[] args) {
         j=45;
       
//        i=45;    // this is not possible because of final keyword i=j;
        System.out.println(j);
        
        /* use of final  keyword
        when if we wish to stop method overriding in inheritance then we use this keyword
        final is use for variable as a full and final they never change
         
         we use final keyword for class to make class as final so class can not be a subclass of any super class
        */
    }
}
