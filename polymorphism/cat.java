public class Cat{
    // Private instance variables
    private String name;
    private int age;
    // Default constructor
    public Cat() {
        // Initialize name to "Unknown"
        this.name = "Unknown";
        // Initialize age to 0
        this.age = 0;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();
        // Use the getter methods to access private variables
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
    }
}