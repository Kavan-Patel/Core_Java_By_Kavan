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
public class S19_AdvanceForLoop {
    public static void main(String[] args) {
        int ar[]={12,23,15,16};
        char c[]={'a','b','s','p'};
        
        String k[]={"ksfjd","fjksd","fjsdkf"};
        System.out.println("With using simple for loop");
        for (int i = 0; i <k.length; i++) {
            System.out.println(ar[i]);
        }
        System.out.println("With using advance for loop");
        for (int i :ar) {
            System.out.println(i);
        }
        for(char s:c)
        {
            System.out.println(s);
        }
        for(String r:k)
        {
            System.out.println(r);
        }
        
    }
}
