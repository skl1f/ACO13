package week2.day1;

/**
 * Created by skl1f on 5/28/2016.
 */
public class Junior extends Coder {

    public Junior(int age, String name, String surname, String programingLanguage) {
        super(age, name, surname, programingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm only trying to make art!");
    }
}
