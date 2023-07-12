package org.example;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));//true
        System.out.println("cat".matches("Cat"));//false
        System.out.println("cat".matches("[Cc]at"));//true
        System.out.println("cat".matches("[^c]at"));//false

        System.out.println("cat".matches("[^abc]at"));//false
        System.out.println("038-493-7977".matches("\\d{3}-\\d{3}-\\d{4}"));//true
        System.out.println("038.493.7977".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));//true
        System.out.println("038 493 7977".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));//false
        System.out.println("038 493 7977".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));//true
        //more space
        System.out.println("038      493 7977".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));//false
        System.out.println("038      493 7977".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]\\d{4}"));//true
        //no or more space
        System.out.println("038493 7977".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]\\d{4}"));//false
        System.out.println("038        493 7977".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]\\d{4}"));//true
        System.out.println("038493 7977".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]\\d{4}"));//true
        // có hoặc không,nhưng ko đc nhiều hơn 1
        System.out.println("038 493 7977".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));//true
        System.out.println("038   493 7977".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));//false
        //độ dài của số
        System.out.println("038 493 797766".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));//false
        System.out.println("038 493 79775555555".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4,}"));//true
        //
        System.out.println("038 493 7977".matches("(\\d{3}[-.\\s]?){2}\\d{4}"));//true



    }
}
