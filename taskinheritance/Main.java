/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskinheritance;

/**
 *
 * @author mohamed ameen
 */
public class Main {
     public static void main(String[] args) {
         Circle obj1 = new Circle(5);
         System.out.println("The area of Circle : " +obj1.areaCircle());
      
        Cylinder obj2 = new Cylinder(5, 10);
        obj2.areaCylinder();
         
     }
    
}
