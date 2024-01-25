import java.lang.*;
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){

        this.name =name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){

        double tax;
        if (this.salary <1000){
            tax =0;
        } else {
            tax = this.salary * 0.03;
        }
        return tax;
    }
    int bonus(int workHours) {

        int overTimeFee = 0;
        if (this.workHours > 40) {
            int overTime = this.workHours - 40;
            overTimeFee = overTime * 30;
        }

        return overTimeFee;
    }

    double raiseSalary(int hireYear) {
        int difference = 2021 - hireYear;

        double newSalary;
        if (difference < 10) {

            newSalary = this.salary * 0.05;
        } else if (difference < 20) {
            newSalary = this.salary * 0.1;
        } else {
            newSalary = this.salary * 0.15;
        }
        return newSalary;
    }

    void ToString() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax(this.salary));
        System.out.println("Bonus: " + bonus(this.workHours));
        System.out.println("Raised Salary: " + raiseSalary(this.hireYear));
        System.out.println("Salary with Tax And Bonus: " + (this.salary + (tax(this.salary))+(bonus(this.workHours))));
        System.out.println("Total Salary: " +(this.salary + raiseSalary(this.hireYear) + tax(this.salary)+(bonus(this.workHours))));
    }

    public static void main (String [] args ){
        Employee employee1 = new Employee("Kemal", 2000.0, 45, 1985);
        employee1.ToString();

    }


}
