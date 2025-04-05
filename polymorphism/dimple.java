class MathOperations{
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class dimple{
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 integers: " + math.add(10, 20));
        System.out.println("Sum of 3 integers: " + math.add(10, 20, 30));
      
    }
}