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
public class multiple_catch {
    public static void main(String[] args) {
        int a[]=new int[3];
//         finally
//         {
//                 System.out.println("This is not possible");
//                 }
        try{
        for(int i=1;i<3;i++)
        {
            a[i]=i*i;
        }
        for (int i = 0; i <3; i++) {
            a[i]=i/i;
        }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This is arryindexout of bond exception"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is arithmetic exception "+e);
        }
        finally
        {
            System.out.println("This block is execute compolsory");
        }
    }
    
}
