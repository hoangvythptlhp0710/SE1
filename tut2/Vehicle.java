
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
        Vehicle v = new Car("Toyota", 1.5, 1.5, 2.5, 1500, 5, "C12345");
        System.out.println(v.travel("Hanoi", "HCM"));
    }

    public String travel(String destinationA, String destinationB) {
        return this.getClass().getSimpleName() + " traveling from " + destinationA + " to " + destinationB;
    }

    public void fly(String destinationA, String destinationB) {
        System.out.println("Flying from " + destinationA + " to " + destinationB);
    }

}
