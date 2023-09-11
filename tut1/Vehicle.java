package tut1;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    private String registrationNumber;

    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.seatingCapacity = seatingCapacity;
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return "Vehicle: " + this.getClass().getSimpleName() + "\nName: " + name + "\nWidth: " + width + "\nHeight: " + height + "\nLength: " + length + "\nWeight: " + weight + "\nSeating Capacity: " + seatingCapacity + "\nRegistration Number: " + registrationNumber;
    }

    protected boolean validatedWeight(double w) {
        return w > 0;
    }

    protected boolean validatedSeatingCapacity(int s) {
        return s > 0;
    }

    protected boolean validatedLength(double l) {
        return l > 0;
    }

    protected boolean validatedRegistrationNumber(String r) {
        return r != null && r.length() <= 12;
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 1.5, 1.5, 2.5, 1500, 5, "C12345");
        Vehicle bus = new Bus("Hyundai", 3.0, 3.5, 11, 10000, 31, "B12345678");
        Vehicle vehicle = new Vehicle("Plane", 25, 25, 25, 25000, 232, "V10010010");
        List<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bus);
        list.add(vehicle);
        for (Vehicle v: list) {
            System.out.println("\n" + v.toString() + "\n");
        }
    }

    
}
