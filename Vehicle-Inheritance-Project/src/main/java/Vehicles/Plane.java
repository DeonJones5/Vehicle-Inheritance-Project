package Vehicles;

public class Plane extends Vehicles{
    private double wingSpan;

    public Plane(String brand, int year, String color, double speed, double wingSpan) {
        super(brand, year, color, speed);
        this.wingSpan = wingSpan;
    }

    public Plane() {
    }

    @Override
    public String toString() {
        return "Brand: " + super.getBrand() + "\nYear: " + super.getYear() + "\nColor: " + super.getColor() +
                "\nSpeed: " + super.getColor() + "\nWingSpan: " + this.wingSpan + "\nEngine State: " + super.getEngineState();
    }
}
