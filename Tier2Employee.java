public class Tier2Employee extends Employee {
    private String certification;

    public Tier2Employee(String firstName,  String lastName, String EmployeeID, String department, String certification) {
        super(firstName, lastName, EmployeeID, department);
        this.certification = certification;
    }
    
    
}
