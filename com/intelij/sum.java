package com.intelij;

import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        System.out.println("enter the name");
        System.out.println("enter the sername");
        Scanner obj=new Scanner(System.in);
        String name;
        String sername;
        name=obj.nextLine();
        sername=obj.nextLine();
        System.out.println(name+" "+sername);
        //System.out.println(sername);
        //obj.nextLine();
        //System.out.println(sername);
        //System.out.println("enter the sername");
        //Scanner obj1=new Scanner(System.in);
        //String sername;
        //sername=obj1.nextLine();
       // System.out.println(sername);
    }
}
