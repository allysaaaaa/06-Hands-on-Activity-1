import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner Cl = new Scanner(System.in);

        System.out.print("Select an option (E for Employee, F for Faculty, S for Student): ");
        String choice = Cl.nextLine().trim().toUpperCase();

        System.out.print("Enter Name: ");
        String name = Cl.nextLine();

        System.out.print("Enter Contact Number: ");
        String contactNumber = Cl.nextLine();

        switch (choice) {
            case "E":
                System.out.print("Enter Monthly Salary: ");
                double salaryE = Double.parseDouble(Cl.nextLine());
                System.out.print("Enter Department: ");
                String departmentE = Cl.nextLine();
                Employee employee = new Employee(name, contactNumber, salaryE, departmentE);
                employee.displayInfo();
                break;

            case "F":
                System.out.print("Enter Monthly Salary: ");
                double salaryF = Double.parseDouble(Cl.nextLine());
                System.out.print("Enter Department: ");
                String departmentF = Cl.nextLine();
                System.out.print("Is the faculty regular/tenured? (Y/N): ");
                boolean isRegular = Cl.nextLine().trim().equalsIgnoreCase("Y");
              
              
            case "S":
                System.out.print("Enter Program: ");
                String program = Cl.nextLine();
                int yearLevel = 0;
                while (true) {
                    System.out.print("Enter Year Level (1-4): ");
                    yearLevel = Integer.parseInt(Cl.nextLine());
                    if (yearLevel >= 1 && yearLevel <= 4) {
                        break; // valid input
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    }
                }
                Student student = new Student(name, contactNumber, program, yearLevel);
                student.displayInfo();
                break;

            default:
                System.out.println("Invalid selection. Please choose E, F, or S.");
        }

        Cl.close();
    }
}
