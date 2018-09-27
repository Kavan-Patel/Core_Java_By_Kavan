/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryBasic_1_to_22;

/**
 *
 * @author kavan
 */
public class R18_ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
