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
public class V22_ContinueBreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i==10)
            {
                
                break;
            }
        }
        for (int i = 0; i < 100; i++) {
            if(i==10)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
