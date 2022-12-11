/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
            System.out.println(" enter the first lenght of triangle :  ");
            int x =in.nextInt();
            System.out.println(" enter the secand lenght of triangle :  ");
            int y = in.nextInt();
            System.out.println(" enter the Third lenght of triangle = base :  ");
            int base =in.nextInt();
        triangle t =new triangle();
        t.setX(x);
        t.setY( y);
        t.setBase(base);
        t.triangleCircumference(x, y, base);
        System.out.println();
        System.out.println("enter the hight of triangle");
        double hight=in.nextDouble();
        t.triangleArea(base, hight);
        System.out.println();
        System.out.println("Enter the reduis of the circle :");
        float reduis=in.nextFloat();
        circle c =new circle();
        c.circuleArea(reduis);
        c.circleCircumference(reduis);
       
    
    
    
}
}
