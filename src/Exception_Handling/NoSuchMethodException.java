/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
//learn
public class NoSuchMethodException {
    public static void main(String[] args) {
        Class c=java.lang.Math.class;
        
        Class[] names=new Class[5];
        
        try {
            Method m=c.getDeclaredMethod("sqrt", names);
            System.out.println(m);
        } catch (java.lang.NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(NoSuchMethodException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
