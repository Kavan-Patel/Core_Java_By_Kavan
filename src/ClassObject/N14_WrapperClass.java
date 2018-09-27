/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package ClassObject;

/**
 *
 * @author kavan
 */
public class N14_WrapperClass {
    public static void main(String[] args) {
        Integer i=new Integer(1);
        int ii=1;
        Integer j=10;
        Integer p;
     
//        Integer p=new Integer();   //This is not possible
        p=77;
        Integer k=new Integer(45);
                Character c=new Character('a');
        Character d=new Character('h');
//        char d='j';
        Float f=new Float(56.56);
        Double e=new Double(57.23);
        Boolean b=new Boolean(true);
        Long l=new Long(444565656);
        
        i=65;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
        System.out.println(b);
        System.out.println(l);
        System.out.println(p);
    }
}
