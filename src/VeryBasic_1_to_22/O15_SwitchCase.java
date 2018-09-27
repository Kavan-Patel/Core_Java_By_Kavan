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
public class O15_SwitchCase {
    public static void main(String[] args) {
        int i=45,j,k;
        String ch="dfd";
        boolean b=true;
        switch(i)
        {
            case 1:
                System.out.println("This is one no statement");
                break;
            case 2:
                System.out.println("THis is 2");
                break;
            case 3:
                System.out.println("This is 3");
                break;
            case 4:
                System.out.println("This is 4");
                break;
            case 5:
                System.out.println("This is 5");
                break;
            default:
                System.out.println("This is default case");
        }
        switch(ch)
        {
            case "d":
                System.out.println("This is a");
                break;
            case "dfd":
                System.out.println(" This is b");
                break;
            case "dfdfd":
                System.out.println(" This is c");
                break;
            case "d+":
                System.out.println(" This is d");
                break;
            default:
                System.out.println(" This is default case");
        }
    }
}
