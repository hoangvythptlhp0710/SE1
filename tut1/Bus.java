package tut1;

public class Bus extends Vehicle { 

    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
    }

    @Override
    protected boolean validatedWeight(double w) {
        return w > 5000.0 && w < 20000.0;
    }

    @Override
    protected boolean validatedLength(double l) {
        return l > 4.0 && l < 10.0;
    }

    @Override
    protected boolean validatedRegistrationNumber(String r) {
        return r != null && r.startsWith("B") && r.length() <= 8;
    }
    
}
