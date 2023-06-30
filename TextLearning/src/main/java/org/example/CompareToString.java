package org.example;

public class CompareToString {
    public static void main(String[] args) {
        String firstName = "aQuoc";
        String secondName = "aQuoc";
        String myNane = "bQuoc";
        String fullName = "aChau";
        System.out.println(firstName.compareTo(secondName)); // 0
        System.out.println(firstName.compareTo(myNane)); // -1
        System.out.println(firstName.compareTo(fullName)); // >0
       /* Trả về giá trị âm: Chuỗi hiện tại (được gọi phương thức) nhỏ hơn chuỗi được so sánh.
          Trả về giá trị dương: Chuỗi hiện tại lớn hơn chuỗi được so sánh.
          Trả về giá trị 0: Hai chuỗi bằng nhau.*/

    }
}
