public class FullTimeEmp extends Employee {

    private double salary;

    public FullTimeEmp(String name, String id, double salary) {
        super(name,id);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return "Full time employee";
    }

    public double getMonthlyPay() {
        return salary;
    }

    
}
