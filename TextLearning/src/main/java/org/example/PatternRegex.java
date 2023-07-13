package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {
    public static void main(String[] args) {
        String regex ="((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.\\s]\\d{3}[-.,\\s]?)(\\d{4})";
        String phoneNumber = "12.233.444.3333";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher( phoneNumber);
        System.out.println(matcher);
        if(matcher.matches()){
            /*
            * Trong biểu thức chính quy, các nhóm bắt được xác định bằng cặp dấu ngoặc ( ).
            * Để biết nhóm bắt nào tương ứng với số thứ tự nào, bạn có thể đếm số lượng cặp dấu ngoặc mở ( từ trái sang phải trong biểu thức chính quy.
              Group  1: ((\\d{1,2})[-.,\\s]?)?
              Group 2: (\\d{1,2})
              Group 3: ((\\d{3})[-.\\s]\\d{3}[-.,\\s]?)
              Group 4: (\\d{3})
              Group 5: (\\d{4})
             * * */
            System.out.println(matcher.group());//12.233.444.3333
            System.out.println(matcher.group(1)); //12.
            //System.out.println(matcher.group("CountryCode"));
            System.out.println(matcher.group(2)); //12
            System.out.println(matcher.group(3));//233.444
            System.out.println(matcher.group(4));//234
            System.out.println(matcher.group(5));//3333
        }

    }

}
