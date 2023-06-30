package org.example;

public class ContentEquals {
    public static void main(String[] args) {
        String myText = "Hello";
        StringBuilder otherText = new StringBuilder("Hello");

        System.out.println(myText.contentEquals(otherText));//true
        System.out.println(myText.equals(otherText));//false
    }
}
