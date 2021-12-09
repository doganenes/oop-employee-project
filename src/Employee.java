public class Employee {

    private String name;
    private double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {

        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;

    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;

        }
        return 0.00;
    }

    public double bonus() {
        int extraHours = workHours - 40;
        if (extraHours > 40) {
            return 30 * extraHours;
        }

        return 0.0;
    }

    public double increaseSalary() {

        int year = 2021 - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return salary * 0.10;
        }
        return salary * 0.15;
    }

    public void toString(Employee emp) {
        System.out.println("Tax: " + emp.tax());

        System.out.println("Bonus: " + emp.bonus());

        System.out.println("İncrease salary: " + emp.increaseSalary());

        double totalSalary = emp.increaseSalary() - emp.tax() + emp.bonus();

        System.out.println("Total salary with tax and bonus: " + totalSalary);

        System.out.println("Total salary with" + " raise of money: " + (emp.tax() + emp.increaseSalary()));
    }
}
