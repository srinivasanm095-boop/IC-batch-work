import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter the three marks:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
        int average=(a+b+c)/3;
        System.out.println("total marks:"+total);
        System.out.println("average marks:"+average);
        System.out.println("user enter text instead of an interger");
        }
        catch (InputMismatchException e) {
            System.out.println("please enter the numeric marks only");
        }
    }
    
}
