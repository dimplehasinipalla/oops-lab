abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat says: Meow!");
    }
}

public class abstract2{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}