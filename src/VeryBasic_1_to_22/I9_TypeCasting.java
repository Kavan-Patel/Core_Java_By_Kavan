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
public class I9_TypeCasting {
    public static void main(String[] args) {
        int i=45,j;
        float f;
        float g=5.60F;
        float k=(float)45.45;
        j=(int) g;
        int div;
        div= (int) (i/g);
       //This is not possible j(float)=g;
        f=i;
        System.out.println(g);
        System.out.println(f);
        System.out.println(j);
        System.out.println("div="+div);
    }
}
