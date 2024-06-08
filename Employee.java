
package com.mycompany.employee;


import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

   
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

 
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        if (hireDate != null && currentDate.isAfter(hireDate)) {
            return Period.between(hireDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    
    public static void main(String[] args) {
        // Create some employees
        Employee employee1 = new Employee("Meynard", 50000, LocalDate.of(2015, 6, 1));
        Employee employee2 = new Employee("Elwin", 60000, LocalDate.of(2018, 9, 15));

      
        System.out.println("Employee: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Hire Date: " + employee1.getHireDate());
        System.out.println("Years of Service: " + employee1.calculateYearsOfService());
        System.out.println();

        System.out.println("Employee: " + employee2.getName());
        System.out.println("Salary: " + employee2.getSalary());
        System.out.println("Hire Date: " + employee2.getHireDate());
        System.out.println("Years of Service: " + employee2.calculateYearsOfService());
    }
}
