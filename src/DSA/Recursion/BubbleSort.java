package com.ianirudhkhabya.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,34,67,89,53,23,122,43};
        selectionSort(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] arr, int r, int c){
        if(r == 0) {
            return;
        }
        if (c < r){
            if (arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        }else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    public static void selectionSort(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                selectionSort(arr, r, c + 1, c);
            }else {
                selectionSort(arr, r, c + 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionSort(arr, r - 1, 0, 0);
        }
    }
}
