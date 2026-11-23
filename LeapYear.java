import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int year;
    System.out.println("Enter the year:");
    year=sc.nextInt();
    if ((year%4==0&&year%100!=0)||(year%400==0)) {
        System.out.println("you entered number is a leap year");
    }
    else{
        System.out.println("you eneterd number is not a leap year");
    }
    sc.close();
   } 
}
