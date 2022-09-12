public class Employee {
    private final String fullname;
    private int department;
    private double salary;
    private final int id;
    private static int counter = 1;


    public Employee(String fullname, int department, double salary) {

        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "| " + getId() + "| " + getFullname() + "| " + getDepartment() + "| " + getSalary() + "|";
    }
}