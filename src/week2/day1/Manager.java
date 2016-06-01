package week2.day1;

/**
 * Created by skl1f on 5/28/2016.
 */
public class Manager extends Employee {
    //    private Coder[] coders;
//    private QA[] testers;
    private Employee[] employees;

    public Manager(int age, String name, String surname, Employee[] employees) {
        super(age, name, surname);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("I make people work");

        for (Employee emp : employees) {
            if (emp != null) {
                emp.work();
                if (emp instanceof Coder) {
                    Coder tmp = (Coder) emp;
                    tmp.writeCode();
                }
            }
        }
    }
}
