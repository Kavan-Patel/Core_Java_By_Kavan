/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryBasic_1_to_22;

import java.util.Scanner;

/**
 *
 * @author kavan
 */
public class Q17_doWhileStatement {
    public static void main(String[] args) {
        int i=0,j=45,k=54,ans,l=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            ans=i+j;
            System.out.println("Answer of this sum is "+ans);
            System.out.println("if you wish to continue then press 1 if no then press 0");
            l=sc.nextInt();
        }while(l==1);
    }
    
}
