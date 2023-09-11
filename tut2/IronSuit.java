import java.util.Scanner;

public class IronSuit extends Vehicle {

    private int power;
    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, int power) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
        return r != null && r.startsWith("I") && r.length() <= 8;
    }

    @Override
    public void fly(String destinationA, String destinationB) {
        int millis = 500;
        if (destinationA.equals("Hanoi")) {
            if (destinationB.equals("Ho Chi Minh")) {
                System.out.print("Hanoi ");
                try {
                    for (int i = 0; i < 30; i++) {
                        Thread.sleep(millis);
                        System.out.print(". ");
                    }
                    System.out.print("" + destinationB);
                }
                catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
            else if (destinationB.equals("Da Nang")) {
                System.out.print("Hanoi ");
                try {
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(millis);
                        System.out.print(". ");
                    }
                    System.out.print("" + destinationB);
                }
                catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
        }
        else if (destinationA.equals("Da Nang")) {
            if (destinationB.equals("Ho Chi Minh")) {
                System.out.print("Da Nang ");
                try {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(millis);
                        System.out.print(". ");
                    }
                    System.out.print("" + destinationB);
                }
                catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
            else if (destinationB.equals("Hanoi")) {
                System.out.print("Da Nang ");
                try {
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(millis);
                        System.out.print(". ");
                    }
                    System.out.print("" + destinationB);
                }
                catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Vehicle ironMan = new IronSuit("Iron", 1.0, 1.0, 1.0, 1.0, 1, "I1234567", 100);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from: ");
        String from = sc.nextLine();
        System.out.print("Enter to: ");
        String to = sc.nextLine();
        ironMan.fly(from, to);
    }
}
