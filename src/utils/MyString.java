package utils;

/**
 * Created by skl1f on 5/24/2016.
 */

public class MyString {
//    todo if your methods receive reference type - make checks on NullPointerException
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
        return String.valueOf(characters);
    }

    public int length() {
        return characters.length;
    }

    public MyString toUpperCase() {
        char[] ch = new char[characters.length];
        System.arraycopy(characters, 0, ch, 0, characters.length);
        MyString result = new MyString(ch);
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toUpperCase(result.characters[i]);
        }
        return result;
    }

    public MyString toLowerCase() {
        char[] ch = new char[characters.length];
        System.arraycopy(characters, 0, ch, 0, characters.length);
        MyString result = new MyString(ch);
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toLowerCase(result.characters[i]);
        }
        return result;
    }


//    Or use System.arraycopy
    public MyString concat(MyString strTwo) {
        int lengths = this.length() + strTwo.length();
        MyString result = new MyString(new char[lengths]);
        int resultIdx = 0;
//        don't need this loop
//        while (resultIdx < result.length()){
            for (int i = 0; i <= this.length() - 1; i++) {
                result.characters[resultIdx] = this.characters[i];
                resultIdx++;
            }
            for (int i = 0; i <= strTwo.length() - 1; i++) {
                result.characters[resultIdx] = strTwo.characters[i];
                resultIdx++;
            }
//        }
        return result;
    }
// todo cause "qwewerqwab".contains("abc) return true
    public boolean contains(MyString subString) {
        boolean result = false;
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] == subString.characters[0]) {
//                i = constant, so its mustn't be in for condition
                for (int k = 0; i < subString.length() - 1 || k < subString.length() - 1; k++) {
                    if (this.characters[i + k] == subString.characters[k]) {
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

        /*char[] ch = new char[chars.length];
        System.arraycopy(chars, 0, ch, 0, chars.length);
        MyString str = new MyString(ch);*/

//        KISS
        return chars != null && contains(new MyString(chars));
    }

    public MyString substring(int beginIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; i < len || beginIndex <= len; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars);
    }


//    Or use System.arraycopy
    public MyString substring(int beginIndex, int endIndex) {
//          forgot to cut array from backside
//        int len = this.length() - beginIndex;
        int len = endIndex - beginIndex + 1;
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
//        todo
//          at first compare links
//          check null
//          only than check chars

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
