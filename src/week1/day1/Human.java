package week1.day1;

/**
 * Created by gorobec on 21.05.16.
 */
public class Human {
//    fields

    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;


    public Human(String name, int age, String sex, int height, int weight){

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this. weight = weight;
    }

    public Human(String name, int age, String sex){

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name == null) return;
        this.name = name;
    }
//  Aly + Ins
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String asString(){
//        return "Name - " + name + ", age - " + age + ", height - " + height;
        return String.format("Name - %s, age - %d, height - %d", name, age, height);
    }
}
