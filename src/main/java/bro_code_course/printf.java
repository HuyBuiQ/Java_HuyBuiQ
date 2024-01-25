package bro_code_course;

import java.sql.SQLOutput;

public class printf {
    public static void main(String[] args) {
        System.out.printf("This is a format string %d",123);
        int integerValue = 42;
        double doubleValue = 3.14;
        boolean booleanValue = true;
        String stringValue = "Hello, World!";
        char charValue = 'A';

        System.out.printf("%d %.2f %b %.5s %c",integerValue,doubleValue,booleanValue,stringValue,charValue);
        System.out.println();
        System.out.printf("Hello %-2s",stringValue);
    }


}
