/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task4;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class main {
    public static void main(String[] args) {
        System.out.println("enter your name and id");
        Scanner input0=new Scanner(System.in);
        String cn=input0.next();
        String ci=input0.next();
        bankAccount a1=new bankAccount(cn,ci);
        System.out.println("enter 1 for deposit / 2 for withdraw / 3 for previous transaction / 4 for exit");
        Scanner input1=new Scanner(System.in);
        int x;
        do{
         x=input1.nextInt();
        switch(x){
            case 1:
                System.out.println("enter the amount you want to deposit");
                Scanner input2=new Scanner(System.in);
                int amount1=input2.nextInt();
                a1.deposition(amount1);
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw");
                Scanner input3=new Scanner(System.in);
                int amount2=input3.nextInt();
                a1.withdraw(amount2);
                break;
            case 3:
                a1.previoust();
                break;
        }
            System.out.println("press 4 for exit or chosse new process ");
        
        }
        while(x!=4);
    
    
}
}
