package mypackage;

import mypackage.cars.Car;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        var car = new Car("BMW", true, 13, 12);
        car.printCar();
        car.setMileage(1430);
        car.printCar();
    }
}
