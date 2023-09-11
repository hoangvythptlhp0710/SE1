public class Motorbike extends Vehicle {

    public Motorbike(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
    }

        @Override
        protected boolean validatedWeight(double w) {
            return w > 0.0 && w < 1000.0;
        }

        @Override
        protected boolean validatedLength(double l) {
            return l > 1.0 && l < 2.0;
        }

        @Override
        protected boolean validatedRegistrationNumber(String r) {
            return r != null && r.startsWith("M") && r.length() <= 8;
        }
}
