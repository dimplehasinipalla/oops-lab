abstract class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary + 5000; // Bonus for manager
    }
}

class Developer extends Employee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary + 3000; // Bonus for developer
    }
}

public class abstract4{
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 20000);
        Employee e2 = new Developer("Bob", 20000);
        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}