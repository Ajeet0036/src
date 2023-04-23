package JOptionPanee;

import javax.swing.*;
import javax.swing.JOptionPane.*;
public class takeinput
{
    public static void main(String[] args)
    {
        /**
        String name;
        String sername;
        name= JOptionPane.showInputDialog("enter your name");
        sername=JOptionPane.showInputDialog("enter your sername");
        System.out.println(name);
        System.out.println(sername);
        System.out.println(name+ " "+ sername);
        JOptionPane.showMessageDialog(null,"name " +"sername");
        **

        int a;
        int b;
        String c;
        c=JOptionPane.showInputDialog("enter a value");
        a=Integer.parseInt(c);
        c=JOptionPane.showInputDialog("enter b value");
        b=Integer.parseInt(c);
        JOptionPane.showMessageDialog(null,a+b);
        System.out.println(a+b);
        */
        int a=5;
        int b=6;
        int c=6;
        boolean expression = a>b && a>c;
        System.out.println(expression);


    }
}
