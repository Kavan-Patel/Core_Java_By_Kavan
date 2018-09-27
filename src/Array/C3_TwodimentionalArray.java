/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Array;

/**
 *
 * @author kavan
 */
public class C3_TwodimentionalArray {
    public static void main(String[] args) {
        int l=0;
        int i[][]=new int[3][3];    //declaration of two dimentional array
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++,l++) {
                i[j][k]=l;
                System.out.print(i[j][k]);
            }
            System.out.println();
        }
    }
}
