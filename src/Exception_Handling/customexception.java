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
class mycoustom extends Exception
{
    mycoustom(String str)
    {
        super(str);
    }
}
public class customexception {
    public static void main(String[] args) throws mycoustom {
        int i=4;
        try
        {
            if(i<25)
            {
                throw new mycoustom("your age is very less then the condition");
            }
        }catch(mycoustom e)
                    {
                        System.out.println("This is my exception block");
                        System.out.println(e.getMessage());
                    }
        finally{
            System.out.println("This is finally");
        }
        }
    }

