/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Interface;

/**
 *
 * @author kavan
 */
interface aa
{
    int i=45;
}
interface bb
{
    int j=35;
    void sum();
}
class cc implements aa,bb
{
    @Override
    public void sum()
    {
        int sum;
        sum=i+j;
        System.out.println("sum is "+sum);
    }
}
public class VariousTypesOfInterface2_46 {
    public static void main(String[] args) {
        
        cc obj=new cc();
        aa obj1;
        obj1=new cc();
        System.out.println(obj.i);
        obj.sum();
//        obj1.sum();    //This is not possible
        System.out.println(obj1.i);
//        System.out.println(obj1.j);   //This is not possible
    }
}
