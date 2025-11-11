public class Employee extends Person {
    private String employeeID;
    private String department;

    public Employee(String firstName, String lastName, String employeeID, String department) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.department = department;
    }

    public String getFileData() {
        return super.getFileData() + "," + employeeID + "," + department;
    }
}