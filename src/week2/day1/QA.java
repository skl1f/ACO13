package week2.day1;

/**
 * Created by skl1f on 5/28/2016.
 */
public class QA extends Employee {
    private int extraMoney;

    public QA(int age, String name, String surname, int extraMoney) {
        super(age, name, surname);
        this.extraMoney = extraMoney;
    }

    @Override
    public String toString() {
        return String.format("%s, bonus - %s", super.toString(), extraMoney);
    }

    @Override
    public void work() {
        System.out.println("I'm testing!");
    }

    public int getExtraMoney() {
        return extraMoney;
    }

    public void setExtraMoney(int extraMoney) {
        this.extraMoney = extraMoney;
    }
}
