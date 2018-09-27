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
public class NullPointer_Excp {
    public static void main(String[] args) {
        try{
        String s="dsfhdsjk";
           System.out.println(s.charAt(10));
        }
        catch(Exception e)
        {
            System.out.println("This is null pointer exception ");
        }
    }
}
