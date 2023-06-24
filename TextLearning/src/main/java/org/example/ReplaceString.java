package org.example;

public class ReplaceString {
    public static void main(String[] args) {
        String myText =" I hate you";
        System.out.println(myText.replace("hate","love"));//I love you

        String myName = "   Quoc ";
        System.out.format("'%s'",myName);// '   Quoc '
        System.out.format("'%s'",myName.strip());// 'Quoc'  hỗ trợ từ java 11,phiên bản cũ hơn có thể dung trim()

        /*trim():
        Phương thức trim() được hỗ trợ từ phiên bản Java ban đầu.
                trim() chỉ loại bỏ các khoảng trắng ở đầu và cuối chuỗi.
                Các ký tự whitespace bao gồm: dấu cách (space), tab, dòng mới (newline), và các ký tự điều khiển khác.
        strip():
        Phương thức strip() được giới thiệu trong phiên bản Java 11.
        strip() cũng loại bỏ khoảng trắng ở đầu và cuối chuỗi, nhưng phương thức này cũng hỗ trợ loại bỏ các ký tự Unicode whitespace khác.
        strip() loại bỏ cả các ký tự whitespace trong Basic Latin và Unicode whitespace (bao gồm các khoảng trắng đặc biệt từ các ngôn ngữ khác nhau).*/


        
        System.out.format("'%s'",myName.stripLeading());//'Quoc '
        System.out.format("'%s'",myName.stripTrailing());// '   Quoc'
    }
}
