package HOSPITAL;

public class Inpatient extends Patient{
    private double roomCharge;
    private int numberOfDays;

    public Inpatient(String magac, double fee, double roomCharge, int numberOfDays) {
        super(magac, fee,5);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    public double calculateBill() {
        return (numberOfDays * roomCharge) + fee;
    }

    public void displayInpatientInfo() {
        System.out.println("INPATIENT");
        System.out.println("Name Of Patient: " + magac);
        System.out.println("ConsultFee: $" + fee);
        System.out.println("RoomCharge : $" + roomCharge);
        System.out.println("numberOfDays: " + numberOfDays);
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println();
    }
}