/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task1;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Task1_1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        System.out.println("enter the character :");
        char ch=in.next().charAt(0);
        int x=(char)ch;
        System.out.println("The ASCII value of "+ch+" is "+x);
    }
}
