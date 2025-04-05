class Animal {
    void sound() {
        System.out.println("Animals make different sounds");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main Class
public class HierarchicalInheritance{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling method of Parent class using Dog object
        dog.sound();
        dog.bark();

        // Calling method of Parent class using Cat object
        cat.sound();
        cat.meow();
    }
}