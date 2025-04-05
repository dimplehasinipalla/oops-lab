class Student {
    String name;
    int age;
    
    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
    
    // Parameterized constructor with name
    Student(String studentName) {
        name = studentName;
        age = 18; // Default age
    }
    
    // Parameterized constructor with name and age
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method overloading: Display student info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with an additional message
    void displayInfo(String message) {
        System.out.println(message + " Name: " + name + ", Age: " + age);
    }
}

public class Main{
    public static void main(String[] args) {
        // Using different constructors
        Student s1 = new Student();               // Default constructor
        Student s2 = new Student("Alice");        // Constructor with name
        Student s3 = new Student("Bob", 22);      // Constructor with name and age

        // Using method overloading
        s1.displayInfo();
        s2.displayInfo("Student Info:");
        s3.displayInfo();
    }
}