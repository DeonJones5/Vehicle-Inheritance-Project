package Vehicles;

public class Car extends Vehicles {

    public Car(String brand, int year, String color, double speed) {
        super(brand, year, color, speed);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Brand: " + super.getBrand() + "\nYear: " + super.getYear() + "\nColor: " + super.getColor() +
                "\nSpeed: " + super.getSpeed() + "\nEngine State: " + super.getEngineState();
    }
}
