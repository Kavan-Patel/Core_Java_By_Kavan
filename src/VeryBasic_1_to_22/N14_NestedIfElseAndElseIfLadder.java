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
public class N14_NestedIfElseAndElseIfLadder {
    public static void main(String[] args) {
        int i=4555,j=988,k=666;
        if(i>j)
            if(i>k)
                System.out.println("i is big");
            else
                System.out.println("k is big");
        else if(k>j)
            System.out.println("k is big");
        else
            System.out.println("j is big");
    }
   
}
