/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Interface;

/**
 *
 * @author kavan
 */
interface a
{
    int i=45;
    void fun();
    
}
interface b extends a
{
    int j=645;
    void fun1();
}
class c implements b
{
    int sum;
    @Override
    public void fun()
    {
        
    }
    public void fun1()
    {
        
    }
    
    int sum()
    {
        sum=i+j;
        return sum;
    }
    void display()
    {
        System.out.println("This sum is from display method"+sum());
    }
}
public class VariousTypesOfInterface1_45 {
    public static void main(String[] args) {
        c obj=new c();
        obj.sum();
        System.out.println(obj.sum());
        obj.display();
    }
}
