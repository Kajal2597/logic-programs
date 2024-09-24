package com.bridgelabz.logicprogram.oops_program;

public class Employee {

    // Instance variables
    private String name;
    private double salary;
    private int id;

    // Constructor to initialize Employee object
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;  // Assuming salary is monthly
    }

    // Method to print employee's name and salary
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Monthly Salary: $" + salary);
        System.out.println("Employee Yearly Salary: $" + calculateYearlySalary());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Bridzlab", 5000, 101);

        // Printing the employee's details
        emp.printEmployeeDetails();
    }
}
