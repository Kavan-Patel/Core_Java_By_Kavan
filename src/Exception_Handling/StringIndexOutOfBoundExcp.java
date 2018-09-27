/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

/**
 *
 * @author kavan
 */
public class StringIndexOutOfBoundExcp {
    public static void main(String[] args) {
        try{
        String s="jay hind";
        System.out.println(s.charAt(26));
        }catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("this is not possible because String indexout of bound excp...");
        }
    }
    
}
