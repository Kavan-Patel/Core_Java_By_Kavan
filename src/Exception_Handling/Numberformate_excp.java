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
public class Numberformate_excp {
    public static void main(String[] args) {
        try{
        String s="44a";
        String y="55";
      
        //int a=10;
        int ans;
        
        ans=Integer.parseInt(s)+Integer.parseInt(y);
        System.out.println(ans);
        }catch(NumberFormatException e)
        {
            System.out.println("This is not possible because numberformate excp/...");
        }
    }
    
}
