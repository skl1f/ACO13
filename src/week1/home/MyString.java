package week1.home;

/**
 * Created by skl1f on 5/24/2016.
 */
public class MyString {
    private char[] characters;

    public MyString(char[] chars) {
        characters = chars;
    }

    public MyString(String string) {
        characters = string.toCharArray();
    }

    public static void toString(MyString str) {
        for (char ch: str.characters){
            System.out.print(ch);
        }
        System.out.println();
    }

    public int length() {
        return this.characters.length;
    }

    public static MyString toUpperCase(MyString str) {
        MyString resultUpper = new MyString(str.characters.clone());
        for (int i = 0; i < resultUpper.length(); i++) {
            resultUpper.characters[i] = Character.toUpperCase(resultUpper.characters[i]);
        }
        return resultUpper;
    }

    public static MyString toLowerCase(MyString str) {
        MyString resultLower = new MyString(str.characters.clone());
        for (int i = 0; i < resultLower.length(); i++) {
            resultLower.characters[i] = Character.toLowerCase(resultLower.characters[i]);
        }
        return resultLower;
    }

    public static MyString concat(MyString strOne, MyString strTwo) {
        int lengths = strOne.length() + strTwo.length();
        MyString result = new MyString(new char[lengths]);
        int counter = 0;
        while (counter < result.length()){
            for (int i = 0; i <= strOne.length() - 1; i++) {
                result.characters[counter] = strOne.characters[i];
                counter++;
            }
            for (int i = 0; i <= strTwo.length() - 1; i++) {
                result.characters[counter] = strTwo.characters[i];
                counter++;
            }
        }
        return result;
    }

    public static boolean substr(MyString string, MyString subString) {
        boolean result = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.characters[i] == subString.characters[0]) {
                for (int k = 0; i < subString.length() - 1 || k < subString.length() - 1; k++) {
                    if (string.characters[i+k] == subString.characters[k]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
