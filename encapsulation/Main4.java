class Car {
    private int speed;

    public void accelerate(int increase) {
        if (increase > 0) {
            speed += increase;
        }
    }

    public void brake(int decrease) {
        if (decrease > 0 && speed - decrease >= 0) {
            speed -= decrease;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(60);
        myCar.brake(20);

        System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
    }
}

