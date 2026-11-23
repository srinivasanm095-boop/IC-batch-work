class Person {
    String name;
    void setName(String n) {
        name = n;
    }
    void displayPerson() {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    int employeeId;
    void setEmployee(int id) {
        employeeId = id;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}
class Manager extends Employee {
    String department;
    void setDepartment(String d) {
        department = d;
    }
    void displayManager() {
        System.out.println("Department: " + department);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Ravi");
        m.setEmployee(101);
        m.setDepartment("IT");
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}