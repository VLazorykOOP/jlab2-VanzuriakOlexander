import java.time.Year;
public class Payment {
    private String surname;
    private String name;
    private double salary;
    private int employYear;
    private double percentageOfIncrease;
    private double tax;
    private int numberOfWorkedDays;
    private int numberOfDaysInMonth;
    private double accruedAmount;
    private double receivedAmount;

    public Payment(String surname, String name, double salary, int employYear, double percentageOfIncrease, double tax, int numberOfWorkedDays, int numberOfDaysInMonth) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.employYear = employYear;
        this.percentageOfIncrease = percentageOfIncrease;
        this.tax = tax;
        this.numberOfDaysInMonth = numberOfDaysInMonth;
        this.numberOfWorkedDays = numberOfWorkedDays;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmployYear(int employYear) {
        this.employYear = employYear;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getSurname() {return this.surname; }

    public String getName() {return this.name; }

    public double getSalary() {return this.salary; }

    public double getTax() {return this.tax; }

    public void setPercentageOfIncrease(double percentageOfIncrease) {
        this.percentageOfIncrease = percentageOfIncrease;
    }

    public void setNumberOfWorkedDays(int numberOfWorkedDays) {
        this.numberOfWorkedDays = numberOfWorkedDays;
    }

    public void setNumberOfDaysInMonth(int numberOfDaysInMonth) {
        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }


    public double calculateAccruedAmount() {
        accruedAmount = salary + (salary * percentageOfIncrease / 100);
        return accruedAmount;
    }

    public double calculateReceivedAmount() {
        receivedAmount = salary / numberOfDaysInMonth * (numberOfWorkedDays + numberOfDaysInMonth / 7 * 2) - tax;
        return receivedAmount;
    }

    public int calculateWorkExperience() {
        return  Year.now().getValue() - employYear;
    }

}

