class StudentName {
    String name="padmanadhan";
}
public class Student{
    public static void main(String[] args) {
        StudentName SN=new StudentName();
        System.out.println(SN.name);
        System.out.println(SN.name.length());
        System.out.println(SN.name.charAt(0));
        System.out.println(SN.name.charAt(6));
        System.out.println(SN.name.charAt(4));
    }
}