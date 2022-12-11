/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author mohamed ameen
 */
public class circle {
    private float reduis;

    public void setY(float reduis) {
        this.reduis = reduis;
    }
    
    

    public void circuleArea(float reduis){
        System.out.println("circleArea = "+(Math.PI*reduis*reduis));
    
    }
    public void circleCircumference(float reduis){
        System.out.println("circleCircumference = "+(Math.PI*2*reduis));
    }

    
}
