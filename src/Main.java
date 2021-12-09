public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1985, 45, 2000, "Kemal");

        System.out.println("Tax: " + emp1.tax());

        System.out.println("Bonus: " + emp1.bonus());

        System.out.println("İncrease salary: " + emp1.increaseSalary());

        double totalSalary = emp1.increaseSalary() - emp1.tax() + emp1.bonus();

        System.out.println("Total salary with tax and bonus: " + totalSalary);

        System.out.println("Total salary with" + " raise of money: " + (emp1.tax() + emp1.increaseSalary()));

        emp1.toString(emp1);
    }

}

