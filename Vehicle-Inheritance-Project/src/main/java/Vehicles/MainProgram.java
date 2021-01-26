package Vehicles;

public class MainProgram {
    public static void main(String[] args) {
        Car car = new Car("Bentley", 2021, "Black", 225);
        Plane plane = new Plane("Boeing", 2019, "White", 2000, 200);

        car.start();

        System.out.println(car);
        System.out.println();

        plane.start();
        System.out.println(plane);

    }


}
