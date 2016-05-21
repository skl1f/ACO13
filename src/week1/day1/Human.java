package week1.day1;

/**
 * Created by gorobec on 21.05.16.
 */
public class Human {
//    fields

    String name;
    int age;
    String sex;
    int height;
    int weight;


    public void init (String name, int age, String sex, int height, int weight){

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this. weight = weight;
    }

    public String asString(){
//        return "Name - " + name + ", age - " + age + ", height - " + height;
        return String.format("Name - %s, age - %d, height - %d", name, age, height);
    }


}
