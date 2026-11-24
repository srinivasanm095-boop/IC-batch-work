class Employee {
    String name;
    double baseSalary;
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + baseSalary);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    void writeCode() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Tester extends Employee {
    String testingTool;
    void runTests() {
        System.out.println("Testing Tool: " + testingTool);
    }
}
class Hero4 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Ravi";
        d.baseSalary = 30000;
        d.programmingLanguage = "Java";
        System.out.println("Developer Details");
        d.displayBasicInfo();
        d.writeCode();
        Tester t = new Tester();
        t.name = "Raju";
        t.baseSalary = 25000;
        t.testingTool = "Selenium";
        System.out.println("\nTester Details");
        t.displayBasicInfo();
        t.runTests();
    }
}