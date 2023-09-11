package tut1;

public class Car extends Vehicle{

    public Car(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
    }

    @Override
    protected boolean validatedWeight(double w) {
        return w > 1000.0 && w < 2000.0;
    }

    @Override
    protected boolean validatedLength(double l) {
        return l > 1.5 && l < 3.5;
    }
    

    @Override
    protected boolean validatedRegistrationNumber(String r) {
        return r != null && r.startsWith("C") && r.length() <= 6;
    }

}
