
package HOSPITAL;

public class HospitalReception {
    public static void main(String[] args) {

        // 1. Diiwaangelinta (Inpatient)
        Inpatient  bukaanJiif = new Inpatient("Ahmed Ali", 30.0, 101, 4);
        bukaanJiif.displayInpatientInfo();

        // 2. Diiwaangelinta  (Outpatient)
        Outpatient bukaanSocod = new Outpatient("Fadumo Mohamed", 20.0, 105, 45.0);
        bukaanSocod.displayOutpatientInfo();
    }
}