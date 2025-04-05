interface A {
    void show();
}

interface B {
    void show();
}

class MyClass implements A, B {
    public void show() {
        System.out.println("Showing from MyClass");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}