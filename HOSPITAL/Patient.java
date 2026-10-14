package HOSPITAL;

public class Patient {
    public String magac;
    public double fee;             // Public
    public int numberkaDhakhtarka; // Public

    // Constructor Patient
    public Patient(String magac, double fee, int numberkaDhakhtarka) {
        this.magac = magac;
        this.fee = fee;
        this.numberkaDhakhtarka = numberkaDhakhtarka;
    }

    // DisplayPatientInfo
    public void displayPatientInfo() {
        System.out.println("Name Of Patient: " + magac);
        System.out.println("Fee: $" + fee);
        System.out.println("Nambarka Dhakhtarka: " + numberkaDhakhtarka);
    }
}