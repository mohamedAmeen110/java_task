/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2_1;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Task2_1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of arr :");
        int size = in.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter num "+(i+1)+" in array");
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
            
        }
        System.out.println("the maxmium number :"+max);

    }
}
