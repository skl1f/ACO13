package week1.home;

/**
 * Created by skl1f on 5/24/2016.
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        MyString str = new MyString(chars);
        char[] charsSecond = {'x', 'y', 'z'};
        MyString strSecond = new MyString(charsSecond);

        MyString concatedStr = MyString.concat(str, strSecond);

        MyString.toString(str);
        System.out.println(str.length());
        MyString.toString(concatedStr);

        MyString upperCaseString = MyString.toUpperCase(concatedStr);
        MyString lowerCaseString = MyString.toLowerCase(upperCaseString);

        MyString.toString(upperCaseString);
        MyString.toString(lowerCaseString);
    }
}
