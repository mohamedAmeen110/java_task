/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task1_2;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Task1_2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int n, r;
float nCr,nPr;      //  nCr = n!/r!(n-r)!         nPr = n!/(n-r)!
int fact=1; 
      System.out.print("Enter the Value of n: ");
      n = in.nextInt();
      System.out.print("Enter the Value of r: ");
      r = in.nextInt();
        for(int i=1;i<=n;i++)
       {
       fact=fact*i;
       }
        
       int nfact=fact;
        fact=1;
       for(int i=1;i<=r;i++)
       {
       fact=fact*i;
       }
       int rfact=fact;
       fact=1;
       int sub=n-r;
       for(int i=1;i<=sub;i++)
       {
       fact=fact*i;
       }
       int subfact=fact; 
       nPr=nfact/subfact;
       nCr=nfact/(rfact*subfact);
       System.out.println("nPr ="+nPr);
       System.out.println("nCr ="+nCr);
    }
}
