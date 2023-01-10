package org.example;

public class Main {
    public static void main(String[] args) {

        // Vi instansirar två Car-objekt
        Car car = new Car("Tesla");
        Car anotherCar = new Car("VW");

        System.out.println(car.getName());
        System.out.println(anotherCar.getName());

        car.setName("Ferrari");
        System.out.println(car.getName());

    }
}