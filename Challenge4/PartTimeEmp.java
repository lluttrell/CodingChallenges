public class PartTimeEmp extends Employee {

    private int hours;
    private double hourlyRate;

    public PartTimeEmp(String name, String id, double rate) {
        super(name,id);
        hourlyRate = rate;
    }

    public void addToHours(int amount) {
        hours += amount;
    }

    public String getStatus() {
        return "Part time employee";
    }

    public double getMonthlyPay() {
        return hours*hourlyRate;
    }

    public double calculateMonthlyPay() {
        double pay = super.calculateMonthlyPay();
        hours = 0;
        return pay;
    }

}
