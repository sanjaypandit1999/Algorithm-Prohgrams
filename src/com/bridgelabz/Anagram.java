package com.bridgelabz;

public class Anagram {
    public static void main(String[] args) {
        AlgorithmMethods anagram = new AlgorithmMethods();
        if (anagram.Anagram("Earth", "Heart"))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}
