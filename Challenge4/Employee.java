public abstract class Employee {

    private String name;
    private String IDNum;

    public Employee(String name, String IDNum) {
        this.name = name;
        this.IDNum = IDNum;
    }

    public String getIDNum() {
        return IDNum;
    }

    public String getName() {
        return name;
    }

    public double calculateMonthlyPay() {
        return getMonthlyPay()*0.90;
    }

    public String toStr() {
        return String.format("IDNum: %s Name: %s MonthlyPay: %.2f Status: %s",
                             IDNum, name, calculateMonthlyPay(), getStatus());
    }

    public abstract double getMonthlyPay();

    public abstract String getStatus();

}
