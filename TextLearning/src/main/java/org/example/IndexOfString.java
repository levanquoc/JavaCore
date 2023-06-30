package org.example;

public class IndexOfString {
    public static void main(String[] args) {
        String myText = "Anh mai yeu em";
        System.out.println(myText.indexOf("mai"));//4
        System.out.println(myText.indexOf(65));// 0

        System.out.println(myText.indexOf(165));// -1

        System.out.println(myText.lastIndexOf("e"));//

        String phoneNumber ="(038) 493-7977";

        String areaCode =pareAreaCode(phoneNumber);
        String exchange =pareExchange(phoneNumber);
        String lineNumber = pareLineNumber(phoneNumber);
    }
    public static String pareAreaCode(String phoneNumber){
       int openParens = phoneNumber.indexOf("(") ;
       int closeParens = phoneNumber.indexOf(")");
       String areaCode = phoneNumber.substring(openParens+1,closeParens);
       return areaCode;
    }
    public static String pareExchange(String phoneNumber){
        int spaceIdx = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIdx+1,hyphenIdx);
        return exchange;
    }
    public static String pareLineNumber(String phoneNumber){
        int hyphenIdx = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphenIdx+1);
        return lineNumber;
    }
}
