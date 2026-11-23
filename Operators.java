import java.util.Scanner;
class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();
        System.out.println("Enter your choice (1-4):");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 3:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 4:
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
