import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int value;
        System.out.println("Enter a number:");
        value=sc.nextInt();
        if (value%2==0) {
            System.out.println("you entered value is a even number");
            
        }
        else{
            System.out.println("you entered value is a odd number");
        }
        sc.close();
    }
    
}
