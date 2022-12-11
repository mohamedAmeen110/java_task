/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task4;

/**
 *
 * @author mohamed ameen
 */
public class bankAccount {
    int previous=0;
    int balance=0;
    String customername;
    String customerid;
    bankAccount(String cn,String ci){
        customername=cn;
        customerid=ci;
                }
    void deposition(int amount){
     if(amount!=0){
     previous=amount;
     balance+=amount;
         System.out.println("customer name : "+customername+"/ customer id : "+customerid);
         System.out.println("your balance is : "+balance);
     }
    }
    void withdraw(int amount){
    if(amount!=0&&amount<=balance){
    previous=(-amount);
    balance-=amount; 
             System.out.println("customer name : "+customername+"customer id : "+customerid);
    System.out.println("your balance is : "+balance);
    }
    }
void previoust(){
if(previous<0){
             System.out.println("customer name : "+customername+"customer id : "+customerid);

    System.out.println("the process is withdraw by value = "+Math.abs(previous));
}
else
{
          System.out.println("customer name : "+customername+"customer id : "+customerid);
   System.out.println("the process is deposit by value = "+Math.abs(previous));
}

}
    
}
