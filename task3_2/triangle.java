/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author mohamed ameen
 */
public class triangle {
   private float x;             // طول الضلع الاول
    private float y;               // طول الضلع الثاني 
    private float Base;             //  القاعدة
    private double Height;          // الارتفاع 

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }
    
    
    
    
    public void triangleCircumference(int x,int y,int z){
        System.out.println("triangleCircumference = "+(x+y+z));
    }
    public void triangleArea(int Base,double Height){
        System.out.println("triangleArea = "+((Base*Height)/2));
    }
    
}
