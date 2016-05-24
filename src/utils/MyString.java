package utils;

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

    public static void print(MyString str) {
        for (char ch: str.characters){
            System.out.print(ch);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.valueOf(this.characters);
    }

    public int length() {
        return this.characters.length;
    }

    public MyString toUpperCase() {
        MyString result = new MyString(this.characters.clone());
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toUpperCase(result.characters[i]);
        }
        return result;
    }

    public MyString toLowerCase() {
        MyString result = new MyString(this.characters.clone());
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toLowerCase(result.characters[i]);
        }
        return result;
    }

    public MyString concat(MyString strTwo) {
        int lengths = this.length() + strTwo.length();
        MyString result = new MyString(new char[lengths]);
        int counter = 0;
        while (counter < result.length()){
            for (int i = 0; i <= this.length() - 1; i++) {
                result.characters[counter] = this.characters[i];
                counter++;
            }
            for (int i = 0; i <= strTwo.length() - 1; i++) {
                result.characters[counter] = strTwo.characters[i];
                counter++;
            }
        }
        return result;
    }

    public boolean contains(MyString subString) {
        boolean result = false;
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] == subString.characters[0]) {
                for (int k = 0; i < subString.length() - 1 || k < subString.length() - 1; k++) {
                    if (this.characters[i+k] == subString.characters[k]) {
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

    public boolean contains(char[] chars) {
        MyString str = new MyString(chars.clone());
        return this.contains(str);
    }

    public MyString substring(int beginIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; i < len || beginIndex <= len; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars.clone());
    }

    public MyString substring(int beginIndex, int endIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; beginIndex <= endIndex; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars.clone());
    }
}
