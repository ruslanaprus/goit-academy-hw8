package examples.inner;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car dieselCar = new Car(new Engine.DieselEngine());
        Car electricCar = new Car(new Engine.DieselEngine());

        System.out.println("dieselCar = " + dieselCar);
        System.out.println("electricCar = " + electricCar);
    }
}
