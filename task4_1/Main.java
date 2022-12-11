/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task4_1;

import static com.mycompany.task4_1.quickSort.sort;
import java.util.Scanner;

/**
 *
 * @author mohamed ameen
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        sort(arr, 0, N - 1);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
