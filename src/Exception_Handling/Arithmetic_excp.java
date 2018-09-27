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
public class Arithmetic_excp {
    public static void main(String[] args) {
        try{
        int i=100,j=4,div;
        int d[]=new int[2];
            System.out.println(d[5]);
        div=i/j;
        
        System.out.println(div);
            System.out.println("This is skipped");
           
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is Exception"+e);
        }
        finally
        {
            System.out.println("This is skipped");
        }
        
        
    }
    
}
