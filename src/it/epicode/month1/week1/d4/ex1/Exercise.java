package it.epicode.month1.week1.d4.ex1;

public class Exercise {

    public static void main(String[] args) {

        Employee employee1 = new Employee("32f94a21", Employee.Levels.EXECUTIVE, Employee.Departments.PRODUCTION, 1000.0, 30);

        Employee employee2 = new Employee("12f341s5", Employee.Levels.WORKER, Employee.Departments.PRODUCTION, 1000.0, 30.0);

        Employee employee3 = new Employee("f67894g0", Employee.Departments.SALES);

        System.out.println("Employee 1:");
        employee1.printEmployeeData();

        System.out.println();

        System.out.println("Employee 2:");
        employee2.printEmployeeData();

        System.out.println();

        System.out.println("Employee 3:");
        employee3.printEmployeeData();

        System.out.println();

        System.out.println("Promoting Employee 1...");
        employee1.promote();
        employee1.printEmployeeData();

        System.out.println();

        employee1.calculatePay();
        employee1.calculatePayWithOvertime(25);
    }

}
