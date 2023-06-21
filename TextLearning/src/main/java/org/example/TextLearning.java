package org.example;

public class TextLearning {
    public static void main(String[] args) {
        String fruit = "apple";
        String otherFruit = "apple";
        System.out.println(fruit==otherFruit);//true  2 biến sẽ cùng trỏ đến 1 địa chỉ

        String vegetable = new String("broccoli");
        String otherVegetable = new String("broccoli");
        System.out.println(vegetable==otherVegetable); // false vì là toán tử new nên 2 biến trỏ đến 2 địa chỉ khác nhau


        String text1 ="quoc";
        System.out.println(text1.toUpperCase()); //QUOC

        String text2 ="QUOC";
        System.out.println(text1.toLowerCase()); //quoc


        String myText ="";
        System.out.println(myText.isEmpty());//true

        String myText1 =" ";
        System.out.println(myText1.isEmpty());//false


        String myText2 =" ";
        System.out.println(myText2.isBlank());//true

        String myText3 ="a";
        System.out.println(myText3.isBlank());//false

        String myText4 ="a ";
        System.out.println(myText3.isBlank());//false
    }
}