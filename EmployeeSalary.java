public class EmployeeSalary {
    void setSalary(double Salary) {
        if (Salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        else {
            System.out.println("Employee salary:" + Salary);
        }
    }
    public static void main(String[] args) {
        EmployeeSalary obj = new EmployeeSalary();
        try {
            obj.setSalary(25000);
            obj.setSalary(50000);
            obj.setSalary(0);
            obj.setSalary(-1000);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}