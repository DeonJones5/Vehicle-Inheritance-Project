package Vehicles;

public class MainProgram {
    public static void main(String[] args) {
        Car car = new Car("Bentley", 2021, "Black", 225);
        Plane plane = new Plane("Boeing", 2019, "White", 2000, 200);

        Car car2 = new Car("Ferrari", 2018, "Red", 245);
        Car car3 = new Car("Lamborghini", 2013, "Yellow", 250);


        car.stop();

        System.out.println(car);
        System.out.println("------------------");

        car2.start();
        System.out.println(car2);
        System.out.println("------------------");

        car3.start();
        System.out.println(car3);
        System.out.println("------------------");

        plane.start();
        System.out.println(plane);

    }


}
