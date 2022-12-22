/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lastquiz1;

/**
 *
 * @author mohamed ameen
 */
public class Cylinder extends Circle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius,String color) {
        super(radius,color);
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    
    
}
