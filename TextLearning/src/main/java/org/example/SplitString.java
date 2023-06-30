package org.example;

public class SplitString {
    public static void main(String[] args) {
        String text = """
                Cả đời cha đi bộ đội
                Qùa về cho mẹ là mái tóc pha sương
                Và những vết thương trên ngực người cha
                Cứ trở gió là đau nhức nhói
                """;
        String[] splitSting = text.split("\n",2);
        System.out.println(splitSting.length);
        System.out.println(splitSting[1]);///Qùa về cho mẹ là mái tóc pha sương
                                          //Và những vết thương trên ngực người cha
                                          //Cứ trở gió là đau nhức nhói
    }

}
