package Lession08.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Petur", "Petrov", 20);
        String name = employee.getName();
        double annualSalary = employee.getAnnualSalary();
        double raisedSalary = employee.raiseSalary(20);
        annualSalary = employee.getAnnualSalary();
       // System.out.println(employee.toString());
        System.out.printf("%s, %.2f, %.2f",name,annualSalary,raisedSalary);
    }
}