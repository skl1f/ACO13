package week2.day1;


/**
 * Created by skl1f on 5/28/2016.
 */
public class TestCompany {
    public static void main(String[] args) {
        Employee coder = new Coder(25, "Alex", "M", "Java");
        Employee junior = new Junior(25, "Jane", "Dou", "Java");
        Employee middle = new Middle(25, "Abdulah", "Ibrahim", "Java");

        System.out.println(coder);

        Employee tester = new QA(36, "Jack", "Sparrow", 500);

        System.out.println(tester);
        Employee[] employees = new Employee[10];

        employees[0] = coder;
        employees[1] = tester;
        employees[2] = junior;
        employees[3] = middle;

        Manager manager = new Manager(40, "Georg", "Bush", employees);

        manager.work();
    }
}