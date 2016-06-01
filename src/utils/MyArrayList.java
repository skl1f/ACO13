package utils;


import java.util.Arrays;

/**
 * Created by skl1f on 6/1/2016.
 */
public class MyArrayList {
    private final int DEFAULT_SIZE = 0;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(Object[] objs) {
        array = new Object[objs.length];
        System.arraycopy(objs, 0, array, 0, objs.length);
    }


    @Override
    public String toString() {
        return String.format("MyArrayList{%s}", Arrays.toString(array));
    }

    public Object get(int index) {
        return array[index];
    }

    public void add(Object obj) {
        Object[] newArray = new Object[size() + 1];
        System.arraycopy(array, 0, newArray, 0, size());
        newArray[size()] = obj;
        array = newArray;
    }

    public void add(int index, Object obj) {
        Object[] newArray = new Object[size() + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = obj;
        System.arraycopy(array, index, newArray, index + 1, size() - 1);
        array = newArray;

    }

    public Object remove(int index) {
        Object[] newArray = new Object[size() - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size() - index - 1);
        array = newArray;
        return array[index];
    }

    public boolean remove(Object obj) {
        for (int index = 0; index <= size(); index++) {
            if (get(index).equals(obj)) {
                remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean contains(Object obj) {
        for (int index = 0; index < size(); index++) {
            if (get(index).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public Object set(int index, Object obj) {
        Object result = array[index];
        array[index] = obj;
        return result;
    }

    public void clear() {
        array = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return array.length;
    }

}
