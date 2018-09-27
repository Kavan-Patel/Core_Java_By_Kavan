/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryBasic_1_to_22;
import java.text.DecimalFormat;
/**
 *
 * @author kavan
 */
public class B2_BuiltInFunction_DecimalFormate {
    
    public static void main(String[] args) {
        double x=5;
        double y,s,l;
        
        y=Math.sqrt(56);
//        Math obj3;
//        obj3 = new Math();
//      Math obj=new Math();
        DecimalFormat df=new DecimalFormat("00000.00");
        System.out.println("56+56");
        System.out.println("min="+Math.min(45, 66));
        System.out.println("y="+y);
        System.out.println("y="+df.format(y));
    }
}
