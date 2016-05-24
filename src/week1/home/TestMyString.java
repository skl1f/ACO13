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

        MyString concat = MyString.concat(str, strSecond);

        MyString.print(str);
        System.out.println(str.length());
        MyString.print(concat);

        MyString upperCaseString = MyString.toUpperCase(concat);
        MyString lowerCaseString = MyString.toLowerCase(upperCaseString);

        MyString.print(upperCaseString);
        MyString.print(lowerCaseString);

        MyString str1 = new MyString("qwewerqw");
        MyString str2 = new MyString("abc");
        boolean sub = MyString.substr(str1, str2);

        System.out.println(sub);

        System.out.println(str2);


    }
}
