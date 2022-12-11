/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskinheritance;

/**
 *
 * @author mohamed ameen
 */
public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    
}
