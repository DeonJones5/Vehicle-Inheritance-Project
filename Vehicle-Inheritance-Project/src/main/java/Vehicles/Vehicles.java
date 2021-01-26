package Vehicles;

public class Vehicles {
    private String brand;
    private int year;
    private String color;
    private double speed;
    private String engineState;

    public Vehicles() {
    }

    public Vehicles(String brand, int year, String color, double speed) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.setEngineState("OFF");
    }

    public void start(){
        if (this.engineState == "ON"){
            System.out.println("Engine is already ON.");
        } else {
            System.out.println("Turn engine ON.");
        }
        setEngineState("ON");
    }

    public void stop(){
        if (this.engineState == "OFF"){
            System.out.println("Engine is already OFF.");
        } else {
            System.out.println("Turn engine OFF");
        }
        setEngineState("OFF");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }
}
