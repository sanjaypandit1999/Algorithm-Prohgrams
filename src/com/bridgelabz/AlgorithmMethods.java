package com.bridgelabz;

public class AlgorithmMethods {
    public void insertionSort(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public boolean Anagram(String word1, String  word2) {
        String[] wordArr1 = this.splitWord(word1);
        String[] wordArr2 = this.splitWord(word2);

        int lengthWord1 = wordArr1.length;
        int lengthWord2 = wordArr2.length;

        if (lengthWord1 != lengthWord2)
            return false;

        this.insertionSort(wordArr1);
        this.insertionSort(wordArr2);

        for (int i = 0; i < lengthWord1; i++)
            if (wordArr1[i] != wordArr2[i])
                return false;

        return true;
    }

    private String[] splitWord(String word) {
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
            arr[i] = word.charAt(i);
        return arr;
    }
}
