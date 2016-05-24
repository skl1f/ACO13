package week1.home;

import utils.MyString;

/**
 * Created by skl1f on 5/24/2016.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        MyString str = new MyString(chars);
        char[] charsSecond = {'x', 'y', 'z'};
        MyString strSecond = new MyString(charsSecond);

        MyString concat = str.concat(strSecond);

        MyString.print(str);
        System.out.println(str.length());
        MyString.print(concat);

        MyString upperCaseString = concat.toUpperCase();
        MyString lowerCaseString = upperCaseString.toLowerCase();

        System.out.println("Upper Case: " + upperCaseString);
        System.out.println("Lower Case: " + lowerCaseString);


        MyString str1 = new MyString("qwewerqw");
        MyString str2 = new MyString("abc");
        MyString str3 = new MyString("qweabcwerqw");
        boolean subContains = str1.contains(str2);
        boolean subContains2 = str3.contains(chars);

        String outputSubContains = String.format("String %s, contains: %s. %s", str1, str2, subContains);
        String outputSubContains2 = String.format("String %s, contains chars[]: %s. %s",
                str3, String.valueOf(chars), subContains2);
        System.out.println(outputSubContains);
        System.out.println(outputSubContains2);

        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3, 5));
    }
}
