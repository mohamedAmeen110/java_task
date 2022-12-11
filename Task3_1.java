/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task3_1;

import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Task3_1 {

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("enter your name ");
        String name=in.nextLine();
        String newName="";
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
           
            if(ch==',')
                continue;
           newName +=ch;
            
        }
        System.out.println(newName);
    }
}
