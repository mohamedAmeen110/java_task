/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task4_1;

/**
 *
 * @author mohamed ameen
 */
public class quickSort {
    public static int partition(int[] arr, int low, int high) {
        int piv = low;
        while (low < high) {
            while (arr[piv] <= arr[high] && piv != high) {
                high--;
            }
            if (piv == high) {
                break;
            } else if (arr[piv] > arr[high]) {
                int temp = arr[high];
                arr[high] = arr[piv];
                arr[piv] = temp;
                piv = high;
            }
            while (arr[piv] >= arr[low] && piv != low) {
                low++;
            }
            if (piv == low) {
                break;
            } else if (arr[piv] < arr[low]) {
                int temp = arr[low];
                arr[low] = arr[piv];
                arr[piv] = temp;
                piv = low;
            }
        }
        return piv;
    }
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high);
            sort(arr, low, piv - 1);
            sort(arr, piv + 1, high);
        }
    }
}

