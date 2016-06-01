package week2.day1;

/**
 * Created by skl1f on 5/28/2016.
 */
public class Coder extends Employee {
    private String programingLanguage;

    public Coder(int age, String name, String surname, String programingLanguage) {
        super(age, name, surname);
        this.programingLanguage = programingLanguage;

    }

    public void writeCode() {
        System.out.println("I'm coding!");
    }

    @Override
    public String toString(){
        return String.format("Programing Language: %s %s", programingLanguage, super.toString());
    }

    @Override
    public void work() {
        System.out.println("I'm making art!");
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
