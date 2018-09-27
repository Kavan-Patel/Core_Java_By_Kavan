/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Array;

/**
 *
 * @author kavan
 */
public class A1_SimpleArray {
    public static void main(String[] args) {
//        int i=10;       //simple declation
          int i[]={10,20,30,40,50};     //Array declation    //here 10 store in i[0] 20 stored in i[1] and onwards
          
          for (int j = 0; j < i.length; j++) {
              System.out.println(i[j]);         //printing array elements with for loop
        }
    }
}
