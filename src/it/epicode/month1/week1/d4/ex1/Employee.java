package it.epicode.month1.week1.d4.ex1;

public class Employee {

    public static double baseSalary = 1000;

    private String employeeId;
    private double salary;
    private double overtimeHourlyPay;
    private Levels level;
    private Departments departments;

    public enum Levels {
        WORKER, OFFICEWORKER, MANAGER, EXECUTIVE
    }
    public enum Departments {
        PRODUCTION, ADMINISTRATION, SALES
    }

    public Employee(String employeeId, Departments departments) {
        this(
             employeeId, Levels.WORKER,
             departments, baseSalary, 30.0
            );
    }

    public Employee(String employeeId, Levels levels, Departments departments, double baseSalary, double overtimeHourlyPay) {
        this.employeeId = employeeId;
        this.level = levels;
        this.departments = departments;
        this.baseSalary = baseSalary;
        this.overtimeHourlyPay = overtimeHourlyPay;
        calculateSalary();
    }

    private void calculateSalary() {
        switch (level) {
            case WORKER:
                salary = baseSalary * 1.1;
                break;
            case OFFICEWORKER:
                salary = baseSalary * 1.2;
                break;
            case MANAGER:
                salary = baseSalary * 1.5;
                break;
            case EXECUTIVE:
                salary = baseSalary * 2;
                break;
        }
    }

    public double getBaseSalary() {return baseSalary;}
    public double getSalary() {return salary;}
    public String getRegistrationNumber() {return employeeId;}
    public Levels getLevels() {return level;}
    public Departments getDepartments() {return departments;}
    public double getOvertimeHourlyPay() {return overtimeHourlyPay;}
    public void setOvertimeHourlyPay(double rate) {
        this.overtimeHourlyPay = rate;
    }
    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public void printEmployeeData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Level: " + level);
        System.out.println("Department: " + departments);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Hourly Rate: " + overtimeHourlyPay);
        System.out.println("Total Salary: " + salary);
    }

    public Levels promote() {
        if (level == Levels.WORKER) {
            System.out.println("You've been promoted to an office worker!");
            level = Levels.OFFICEWORKER;
            baseSalary *= 1.2;
        } else if (level == Levels.OFFICEWORKER) {
            System.out.println("You've been promoted to Manager!");
            level = Levels.MANAGER;
            baseSalary *= 1.5;
        } else if (level == Levels.MANAGER) {
            System.out.println("You've been promoted to Executive!");
            level = Levels.EXECUTIVE;
            baseSalary *= 2.0;
        } else {
            System.out.println("Sorry, we cannot promote a top-level executive.");
        }
        return level;
    }

    public double calculatePay() {
        System.out.println("Your salary is: " + salary);
        return salary;
    }

    public double calculatePayWithOvertime( int overtimeHours) {
        double overtimePay = overtimeHours * getOvertimeHourlyPay();
        System.out.println("Your salary with overtime is: " + (salary + overtimePay));
        return salary + overtimePay;
    }

}
