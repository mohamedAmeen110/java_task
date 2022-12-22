/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lastquiz1;

/**
 *
 * @author mohamed ameen
 */
class Circle {
   protected double radius;
    protected String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea(){
            return Math.PI*radius*radius;
        }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}
class Cylinder extends Circle{
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

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    
    
    
}

public class Main {
     public static void main(String[] args) {
          Circle obj1 = new Circle(5,"red");
         System.out.println("The area of Circle : " + obj1.getArea());
      
        Cylinder obj2 = new Cylinder(10,5);
         System.out.println("the volume of Cylinder : "+obj2.getVolume());
         System.out.println(obj1.toString());
         System.out.println(obj2.toString());

         
         
     }
    
}
