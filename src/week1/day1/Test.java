package week1.day1;

/**
 * Created by gorobec on 21.05.16.
 */
public class Test {
    public static void main(String[] args) {
        Human person = new Human("Kolja", 25, "M", 180, 85);

        /*String personInfo = person.asString();
        System.out.println(personInfo);*/

        System.out.println(person.asString());


        person.setName("Vasja");

        System.out.println(person.asString());


    }

}
