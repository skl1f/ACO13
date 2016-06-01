package week2.home;

import utils.MyArrayList;

/**
 * Created by skl1f on 6/1/2016.
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("One");
        arrayList.add("Second");
        arrayList.add(1, "2");

        System.out.println(arrayList);

        arrayList.remove("2");
        System.out.println("arrayList contains \"2\": " + arrayList.contains("2"));
        arrayList.set(0, "1");
        System.out.println("arrayList contains \"1\": " + arrayList.contains("1"));
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        arrayList = new MyArrayList(new Object[]{"one", "second"});
        System.out.println(arrayList);
    }

}
