/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author kavan
 */
public class D4_ArrayWithScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer s[]=new Integer[20];
        int i[]=new int[10];
        for (int j = 0; j < 10; j++) {
            s[j]=sc.nextInt();
        }
        System.out.println("After scane is done");
        for (int j = 0; j < 10; j++) {
            System.out.println(s[j]);
        }
    }
}
