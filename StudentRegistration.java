import java.util.Scanner;

public class StudentRegistration {

    String studentName;

    int age;

    String marks;

    String[] subjects = {"Java", "Python", "SQL"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentRegistration obj = new StudentRegistration();

        try {

            System.out.println("Enter student name:");

            obj.studentName = sc.nextLine();

            System.out.println("Enter age:");

            obj.age = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter marks:");

            obj.marks = sc.nextLine();

            System.out.println("Enter subject position:");

            int position = sc.nextInt();

            if (obj.studentName == null) {

                System.out.println(obj.studentName.length());

            }

            System.out.println("Student name length:" + obj.studentName.length());

            int m = Integer.parseInt(obj.marks);

            System.out.println("Student marks:" + m);

            if (obj.age <= 0) {

                throw new IllegalArgumentException();

            }

            System.out.println("Subject:" + obj.subjects[position]);

            System.out.println("Student Registration Completed");

        }

        catch (NullPointerException e) {

            System.out.println("Student name is not available");

        }

        catch (NumberFormatException e) {

            System.out.println("Invalid marks format");

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid subject position");

        }

        catch (IllegalArgumentException e) {

            System.out.println("Age must be greater than zero");

        }

    }

}