package assegment_1and2;
// Parent class: stores common employee information

    class Employee {
        protected String employeeId;
        protected String name;
        protected String dep;
        protected double basicSalary;
        // Constructor initializes employee details

        public Employee(String employeeId, String name, String department, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.dep = department;
            this.basicSalary = basicSalary;
        }
        // Method to calculate the employee's salary

        public double calculateSalary() {
            return basicSalary;
        }
        // Returns the employee category

        public String getCategory() {
            return "Employee";
        }
        // Displays employee information and salary

        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Category: " + getCategory());
            System.out.printf("Monthly Salary: $%.2f%n", calculateSalary());
            System.out.println();
        }
    }
// Inheritance: full-time employee adds an allowance

    class FullTimeEmployee extends Employee {
        private double allowance;

        public FullTimeEmployee(String id, String name, String department, double basicSalary, double allowance) {
            super(id, name, department, basicSalary);
            this.allowance = allowance;
        }
        // Override: salary includes the allowance

        @Override
        public double calculateSalary() {
            return basicSalary + allowance;
        }

        @Override
        public String getCategory() {
            return "Full-Time Employee";
        }
    }
// Inheritance: part-time salary depends on hours worked

    class PartTimeEmployee extends Employee {
        private double hoursWorked;
        private double hourlyRate;
        // Calculate salary using hours multiplied by hourly rate

        public PartTimeEmployee(String id, String name, String department, double hoursWorked, double hourlyRate) {
            super(id, name, department, 0);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }
        // Calculate salary including the bonus

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        @Override
        public String getCategory() {
            return "Part-Time Employee";
        }
    }
// Inheritance: manager receives a bonus

    class Manager extends Employee {
        private double bonus;

        public Manager(String id, String name, String department, double basicSalary, double bonus) {
            super(id, name, department, basicSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + bonus;
        }

        @Override
        public String getCategory() {
            return "Manager";
        }
    }





