/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package ClassObject;

/**
 *
 * @author kavan
 */
class xyz
{
    int i=45;
    void display()
    {
        
    }
    int j=55;
    void fake()
    {
        
    }
}
public class K11_Dotoperator {
       public static void main(String[] args) {
           xyz obj;
           obj=new xyz();
           String s=new String();
            s="      THis is String    ";
            
        //here String is a class and s is a obj
        String f="     dsdfdfdfdsf";
        
        String p=s.toUpperCase();
       String q=s.trim();
       char c=s.charAt(16);
           
           System.out.println(obj.i);
           System.out.println(c);
           System.out.println(q);
           System.out.println(p);
           System.out.append(f);
           System.out.append(q);
           System.out.println("kdfjsdlfdsfkl");
           System.out.println("kfjsdlskfdsjlf");
    }
    
}
