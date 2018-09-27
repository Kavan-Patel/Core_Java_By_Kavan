/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author kavan
 */
class p
{
    int a=33;
}
class q
{
    int b=23;
}
class s extends p
{
    int c;
    void m()
    {
        System.out.println(a+5);
    }
}
class w extends q
{
    int d;
    void q()
    {
        d=b+44;
        System.out.println(d);
    }
}
class yt extends p
{
    int pp;
}
class tt extends s
{
    int sq;
}
public class HirarchicalInheritance_42 {
    public static void main(String[] args) {
        w obj=new w();
        obj.q();
    }
}
