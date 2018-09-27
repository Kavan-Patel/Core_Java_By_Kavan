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
public class K11_TurnaryOperator {
    void display()
    {
        System.out.println("This is display");
    }
    public static void main(String[] args) {
        K11_TurnaryOperator obj=new K11_TurnaryOperator();
        obj.display();
        int i=10,j=45;
        if(i>j)
            System.out.println("grator is="+i);
        else
            System.out.println("grator is="+j);
        
        int k=(i>j)?i:j;    //turnary operator   condition?true:false;
        System.out.println("This is by turnary operator grator is="+k);
    }
}
