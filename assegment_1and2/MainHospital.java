package assegment_1and2;

public class MainHospital {
    public static void main(String[] args) {

        HospitalMedicalBillingSystem.MedicalService[] services = {
                new HospitalMedicalBillingSystem.Consultation("S001", 15, 10),
                new HospitalMedicalBillingSystem.LaboratoryTest("S002", 10, 8),
                new HospitalMedicalBillingSystem.Ultrasound("S003", 30, 10)
        };

        double totalBill = 0;

        System.out.println("===== HOSPITAL BILLING SYSTEM =====");
        System.out.println();

        for (HospitalMedicalBillingSystem.MedicalService service : services) {
            service.displayServiceInfo();
            totalBill += service.calculateTotalCost();
        }

        System.out.println("------------------------------");
        System.out.printf("Total Hospital Bill: $%.2f%n", totalBill);
    }
}
