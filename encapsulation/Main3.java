class Employee {
    private String name;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        if (s >= 10000) {
            salary = s;
        } else {
            System.out.println("Salary must be at least 10,000");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Raj");
        emp.setSalary(12000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}
