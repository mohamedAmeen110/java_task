/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop;

/**
 *
 * @author mohamed ameen
 */
class product {
    protected int prices;

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public product(int prices) {
        this.prices = prices;
    }
    
    
    
}
class Book extends product {

    public Book(int prices) {
        super(prices);
    }
    
    
}

class ChildrenBook extends Book{

   
    public ChildrenBook(int price) {
        super(price);
    }

   
    
    
}
public class Main {
    public static void main(String[] args) {
        
        ChildrenBook cb[]=new ChildrenBook[3];
        cb[0]=new ChildrenBook(50);
        cb[1]=new ChildrenBook(70);
        cb[2]=new ChildrenBook(60);
        
        int sum=0;
        
        for (int i = 0; i < cb.length; i++) {
            sum += cb[i].getPrices();
            
        }
        System.out.println("sum of prices = "+sum);


        
       
        
        
        
    }
    
}
