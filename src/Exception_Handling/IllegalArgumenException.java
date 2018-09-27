/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

import java.io.Serializable;

/**
 *
 * @author kavan
 */
    

public class IllegalArgumenException  {
    public static void main(String[] args) {
        try{
        String T="People love to program in java";
        String P="java";
        String result=T.replaceAll(P, "\\!#&$kavan");
        System.out.println(result);
        }catch(IllegalArgumentException e)
        {
            System.out.println("This is error of "+e);
        }
    }
   
}
