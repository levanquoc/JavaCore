package org.example;

public class ConcatString {
    public static void main(String[] args) {
        String myTest1 ="This is my test 1";
        String myTest2 ="This is my test 2";
        System.out.println(myTest1 + " " + myTest2);//This is my test 1 This is my test 2
        System.out.println(myTest1.concat(" " +myTest2));
        String myString = new StringBuilder().append(myTest1)
                .append(" ")
                .append(myTest2).toString();
        System.out.println(myString);//This is my test 1 This is my test 2
        String finalString = new StringBuffer().append(myTest1)
                .append(" ")
                .append(myTest2).toString();
        System.out.println(finalString);//This is my test 1 This is my test 2
    }
}
