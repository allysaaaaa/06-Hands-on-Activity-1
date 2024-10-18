class Student extends Person {
    private String program;
    private int yearLevel;

    public Student(String name, String contactNumber, String program, int yearLevel) {
        super(name, contactNumber);
        this.program = program;
        this.yearLevel = yearLevel;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
    }
}


