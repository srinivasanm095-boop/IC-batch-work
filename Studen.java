class Main{
    private String name;
    private int rollNumber;
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
public class Studen{
    public static void main(String[] args) {
        Main m = new Main();
        m.setName("Padmanadhan");
        m.setRollNumber(101);
        System.out.println("Name: " + m.getName());
        System.out.println("Roll Number: " + m.getRollNumber());
    }
}