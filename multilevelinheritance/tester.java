class Shape {
 void display() {
 System.out.println("Inside display");
 }
}
class Rectangle extends Shape {
 void area() {
 System.out.println("Inside area");
 }
}
class Cube extends Rectangle {
void volume() {
 System.out.println("Inside volume");
 }
}
public class tester {
 public static void main(String[] arguments) {
 Cube cube = new Cube();
 cube.display();
 cube.area();
 cube.volume();
 }
}