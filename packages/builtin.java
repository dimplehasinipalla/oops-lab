import java.util.Scanner; // built-in package for input

public class builtin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();  // always good to close Scanner
    }
}