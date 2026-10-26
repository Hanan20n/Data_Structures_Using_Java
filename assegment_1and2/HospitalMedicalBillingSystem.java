
package assegment_1and2;

public class HospitalMedicalBillingSystem {

    // Abstract parent class for medical services
    public static abstract class MedicalService {
        protected String serviceId;
        protected String serviceName;
        protected double baseCost;

        // Initialize service information
        public MedicalService(String serviceId, String serviceName, double baseCost) {
            this.serviceId = serviceId;
            this.serviceName = serviceName;
            this.baseCost = baseCost;
        }

        // Each service calculates its own total cost
        public abstract double calculateTotalCost();

        // Display service details and total cost
        public void displayServiceInfo() {
            System.out.println("Service ID: " + serviceId);
            System.out.println("Service: " + serviceName);
            System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
            System.out.println();
        }
    }

    // Consultation adds the doctor's fee
    public static class Consultation extends MedicalService {
        private double doctorFee;

        public Consultation(String id, double baseCost, double doctorFee) {
            super(id, "Consultation", baseCost);
            this.doctorFee = doctorFee;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + doctorFee;
        }
    }

    // Laboratory test adds the test charge
    public static class LaboratoryTest extends MedicalService {
        private double testCharge;

        public LaboratoryTest(String id, double baseCost, double testCharge) {
            super(id, "Laboratory Test", baseCost);
            this.testCharge = testCharge;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + testCharge;
        }
    }

    public static class Ultrasound extends MedicalService {
        private double additionalFee;

        public Ultrasound(String id, double baseCost,
                          double additionalFee) {
            super(id, "Ultrasound", baseCost);
            this.additionalFee = additionalFee;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + additionalFee;
        }
    }
}
