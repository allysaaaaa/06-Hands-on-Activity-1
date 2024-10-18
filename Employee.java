class Employee extends Person {
    private double salary;
    private String department;

    public Employee(String name, String contactNumber, double salary, String department) {
        super(name, contactNumber);
        this.salary = salary;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
