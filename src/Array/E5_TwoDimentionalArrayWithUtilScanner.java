/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author kavan
 */
public class E5_TwoDimentionalArrayWithUtilScanner {
    public static void main(String[] args) {
        int i[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            
            for (int k = 0; k < 3; k++) {
                i[j][k]=sc.nextInt();
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(i[j][k]);
            }
            System.out.println();
        }
    }
    
}
