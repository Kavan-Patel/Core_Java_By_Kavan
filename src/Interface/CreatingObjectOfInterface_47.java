/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Interface;

/**
 *
 * @author kavan
 */
interface x
{
    void display();
}
class y implements x
{
    public void display()
    {
        System.out.println("THis is method of interface in class");
    }
}
public class CreatingObjectOfInterface_47 {
    public static void main(String[] args) {
        x obj;
        obj=new y();
        obj.display();
    }
}
