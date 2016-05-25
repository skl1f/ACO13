package week1.home;

import utils.MyString;

/**
 * Created by skl1f on 5/24/2016.
 * Testing MyString
 */
public class TestMyString {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        MyString str = new MyString(chars);
        char[] charsSecond = {'x', 'y', 'z'};
        MyString strSecond = new MyString(charsSecond);

        MyString concat = str.concat(strSecond);

        String outputConcat = String.format("\"%s\" + \"%s\" => \"%s\"", str, strSecond, concat);
        System.out.println(outputConcat);

        MyString upperCaseString = concat.toUpperCase();
        MyString lowerCaseString = upperCaseString.toLowerCase();

        System.out.println("Upper Case: " + upperCaseString);
        System.out.println("Lower Case: " + lowerCaseString);


        MyString str1 = new MyString("qwewerabc");
        MyString str2 = new MyString("abc");
        MyString str3 = new MyString("qweabcwerqw");
        boolean subContains = str1.contains(str2);
        boolean subContains2 = str3.contains(chars);

        String outputSubContains = String.format("String %s, contains: %s. %s", str1, str2, subContains);
        String outputSubContains2 = String.format("String %s, contains chars[]: %s. %s",
                str3, String.valueOf(chars), subContains2);
        System.out.println(outputSubContains);
        System.out.println(outputSubContains2);

        MyString subsFrom = str3.substring(3);
        String outputSubsFrom = String.format("Substring \"%s\" From 3 to the end: %s", str3, subsFrom);
        System.out.println(outputSubsFrom);


        MyString subsFromTo = str3.substring(3, 5);
        String outputSubsFromTo = String.format("Substring \"%s\" From 3 to 5: %s", str3, subsFromTo);
        System.out.println(outputSubsFromTo);

        MyString strForTrim = new MyString("   qweabcwerqw   ");
        MyString myStrTrim = strForTrim.trim();
        String outputTrim = String.format("Trim whitespaces In: \"%s\". Out: \"%s\"", strForTrim, myStrTrim);
        System.out.println(outputTrim);

        MyString equalsString1 = new MyString("abcd");
        MyString equalsString2 = new MyString("abcd");
        boolean equality = equalsString1.equals(equalsString2);
        String outputEquality  = String.format("Check if MyString: \"%s\" are equal to: \"%s\". Result: %s",
                equalsString1, equalsString2, equality);
        System.out.println(outputEquality);

        MyString equalsString3 = new MyString("sfghgfhh");
        MyString equalsString4 = new MyString("sdfhgsdh");
        boolean equality1 = equalsString3.equals(equalsString3);
        String outputEquality1  = String.format("Check if MyString: \"%s\" are equal to: \"%s\". Result: %s",
                equalsString3, equalsString3, equality1);
        System.out.println(outputEquality1);

        int index = equalsString4.indexOf('f');
        String indexStr = String.format("Index of character \"f\" in \"%s\" is: %s", equalsString4, index);
        System.out.println(indexStr);
    }
}
