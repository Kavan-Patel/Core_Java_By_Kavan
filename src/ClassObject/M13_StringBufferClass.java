/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package ClassObject;

/**
 *
 * @author kavan
 */
public class M13_StringBufferClass {
    public static void main(String[] args) {
        StringBuffer br=new StringBuffer("Object Language");
        System.out.println("Original String ="+br);
        System.out.println("Capacity of StringBuffer ="+br.capacity());
        System.out.println("length of string ="+br.length());
        for (int i = 0; i <br.length(); i++) {
            System.out.println("char at position "+i+"="+br.charAt(i));
        }
        System.out.println("String after delete some part ="+br.delete(6, 7));
        System.out.println("insert char in String ="+br.insert(6, "-"));
//        System.out.println("Setting length for stringbuffer "+br.setLength(10));
        String s=br.toString();
        System.out.println("in string formate ="+s);
        System.out.println("REplacing some values ="+br.replace(6, 7, " oriented "));
        System.out.println("Reverce String ="+br.reverse());
        System.out.println("Appand String ="+br.append(s));
    }
}
