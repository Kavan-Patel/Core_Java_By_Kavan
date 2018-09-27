/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Array;

/**
 *
 * @author kavan
 */
public class B2_ArrayWithScane {
    public static void main(String[] args) {
        int i[]=new int[5];
        char c[]=new char[10];
        String s[]=new String[20];
        boolean b[]=new boolean[10];
        s[0]="yashvi";
        s[1]="kavan";
        s[2]="jkdsfjldf";
        b[0]=true;
        b[1]=false;
        b[2]=true;
        c[0]='h';
        c[1]='d';
        c[2]='g';
        for (int j = 0; j <3; j++) {
            i[j]=j;
            System.out.println(i[j]);
            System.out.println(c[j]);
            System.out.println(s[j]);
            System.out.println(b[j]);
        }
    }
}
