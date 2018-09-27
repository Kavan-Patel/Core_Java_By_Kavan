/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author kavan
 */

class Complex {
 
    private double re, im;
    double ree,imm;
     
    // A normal parametrized constructor 
    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
     
    // copy constructor
    Complex(Complex c) {
        System.out.println("Copy constructor called");
        ree = c.re;
        imm = c.im;
    }
      
    // Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + ree + " + " + imm + ")";
    }
}
 

public class C3_CopyConstructor {
    public static void main(String[] args) {
        Complex c1 = new Complex(10.33, 15.12);
         
        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);   
//        c2.toString();
 
        // Note that following doesn't involve a copy constructor call as 
        // non-primitive variables are just references.
        Complex c3 = c2;   
 
        System.out.println(c3.toString()); // toString() of c2 is called here
    }
}
