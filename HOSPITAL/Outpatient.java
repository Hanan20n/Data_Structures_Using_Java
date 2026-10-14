package HOSPITAL;

public class Outpatient extends Patient {
    private double labCharge; // Lacagta lab-ka ama dhiigga

    // Constructor-ka Outpatient
    public Outpatient(String magac, double fee, int numberkaDhakhtarka, double labCharge) {
        super(magac, fee, numberkaDhakhtarka);
        this.labCharge = labCharge;
    }

    // Xisaabinta Total-ka Biilka Bukaan Socodka: LabCharge + Fee
    public double calculateBill() {
        return labCharge + fee;
    }

    // Soo bandhigida xogta bukaan socodka
    public void displayOutpatientInfo() {
        System.out.println("OUTPATIENT");
        displayPatientInfo();
        System.out.println("labCharge: $" + labCharge);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

