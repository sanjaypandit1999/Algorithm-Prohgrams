package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1,20,18,65};
        AlgorithmMethods insertionsort = new AlgorithmMethods();
        insertionsort.bubbleSort(arr);
        insertionsort.display(arr);
    }

}
