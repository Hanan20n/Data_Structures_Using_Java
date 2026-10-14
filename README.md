# Data_Structures_Using_Java# 
🏥 Hospital Package - OOP Assignment

Java-based console application implementing Object-Oriented Programming (OOP) concepts (Inheritance and Polymorphism) for a hospital management and reception system.

---

## 📂 Project Structure

The project is organized under the package `HOSPITAL` and consists of the following classes:

1. **`Patient.java` (Superclass):**
   * Acts as the parent class for all patients.
   * Properties: `magac` (Name) and `fee` (Consultation Fee).

2. **`Inpatient.java` (Subclass):**
   * Inherits from `Patient`.
   * Additional Properties: `roomCharge` and `numberOfDays`.
   * Method: `calculateBill()` to compute total fees based on room charges and days stayed.

3. **`Outpatient.java` (Subclass):**
   * Inherits from `Patient`.
   * Additional Property: `labCharge`.
   * Method: `calculateBill()` to compute total fees including laboratory charges.

4. **`HospitalReception.java` (Main Class):**
   * Acts as the reception desk.
   * Initializes and displays billing details for both Inpatients and Outpatients.

---

## 🧮 Bill Calculation Logic

* **Inpatient Total Bill:** 
  $$\text{Total Bill} = (\text{numberOfDays} \times \text{roomCharge}) + \text{fee}$$

* **Outpatient Total Bill:** 
  $$\text{Total Bill} = \text{labCharge} + \text{fee}$$

---

## 🚀 How to Run

1. Open your Java IDE (IntelliJ IDEA, Eclipse, etc.).
2. Ensure all files are placed inside a folder/package named **`HOSPITAL`**.
3. Compile and run **`HospitalReception.java`** to see the console output.
Data_Structures_Using_Java
