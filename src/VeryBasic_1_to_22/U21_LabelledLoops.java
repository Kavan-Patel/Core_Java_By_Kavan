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
public class U21_LabelledLoops {
    public static void main(String[] args) {
        /*
        if we wish to dont execute some no of iteam in loop then labelled loops are useful
        */
//        lp1:  //System.out.println("This is no 4 This is invalid");
lp1: for (int i = 0; i < 10; i++) {
            
            if(i==4)
            {
                continue lp1;
            }
             System.out.println(i);
        }
    }
}
