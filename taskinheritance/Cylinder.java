/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskinheritance;

/**
 *
 * @author mohamed ameen
 */
public class Cylinder extends Circle{
    
    protected double height;

   public Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public void areaCylinder() { 
        System.out.println("The area of Cylinder: "+2 * areaCircle() + (2 * Math.PI * radius * height)); 
    }
}
