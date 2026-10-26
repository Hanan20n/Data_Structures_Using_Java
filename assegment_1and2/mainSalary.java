package assegment_1and2;

public class mainSalary {

        public static void main(String[] args) {
            Employee[] employees = {
                    new FullTimeEmployee("EMP001", "Ahmed Ali", "IT", 600, 50),

                    new PartTimeEmployee("EMP002", "Fatima Hassan", "Finance", 20, 12),

                    new Manager("EMP003", "Mohamed Omar", "Management", 1000, 200)
            };

            System.out.println(" ===== EMPLOYEE SALARY REPORT ===== ");
            System.out.println();

            for (Employee employee : employees) {
                employee.displayInfo();
            }
        }
}
