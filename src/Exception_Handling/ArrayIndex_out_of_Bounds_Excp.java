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
public class ArrayIndex_out_of_Bounds_Excp {
    public static void main(String[] args) {
        try{
        char s[]={'c','d','k'};
        System.out.println(s[3]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error "+e);
        }
    }
    
}
