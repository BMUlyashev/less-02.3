package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);
        bicycle.check();
        bicycle2.check();

        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);
        car.check();
        car2.check();

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 6);
        truck.check();
        truck2.check();
    }
}
