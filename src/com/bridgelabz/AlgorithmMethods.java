package com.bridgelabz;

public class AlgorithmMethods {
    public void insertionSort(String arr[]){
        for(int i = 0;i< arr.length;i++){
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr [j+1] = key;
        }
    }
    public void display (String arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
