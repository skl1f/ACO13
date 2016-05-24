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
        char[] ch = new char[this.characters.length];
        System.arraycopy(this.characters, 0, ch, 0, this.characters.length);
        MyString result = new MyString(ch);
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toUpperCase(result.characters[i]);
        }
        return result;
    }

    public MyString toLowerCase() {
        char[] ch = new char[this.characters.length];
        System.arraycopy(this.characters, 0, ch, 0, this.characters.length);
        MyString result = new MyString(ch);
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
        char[] ch = new char[chars.length];
        System.arraycopy(chars, 0, ch, 0, chars.length);
        MyString str = new MyString(ch);
        return this.contains(str);
    }

    public MyString substring(int beginIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; i < len || beginIndex <= len; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars);
    }

    public MyString substring(int beginIndex, int endIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; beginIndex <= endIndex; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars);
    }

    public MyString trim() {
        int beginIndex = 0, endIndex = this.characters.length - 1;
        while (this.characters[beginIndex] == ' ') {
            beginIndex++;
            }
        while (this.characters[endIndex] == ' ') {
            endIndex--;
        }
        return this.substring(beginIndex, endIndex);
    }

    public boolean equals(MyString string) {
        if (this.length() != string.length()) {
            return false;
        } else {
            for (int i = 0; i < this.length(); i++) {
                if (this.characters[i] != string.characters[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}
