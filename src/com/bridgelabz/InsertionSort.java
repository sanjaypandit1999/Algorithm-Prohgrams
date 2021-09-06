package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        String arr[] = {"sanjay", "Aviral", "Ramkrishna"};
        AlgorithmMethods insertionsort = new AlgorithmMethods();
        insertionsort.insertionSort(arr);
        insertionsort.display(arr);
    }

}
