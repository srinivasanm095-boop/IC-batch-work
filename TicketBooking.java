import java.util.Scanner;
public class TicketBooking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String passengerName ="Rahul";
        System.out.println("Name:"+passengerName);
        System.out.println("Enter the character position:");
        int position=sc.nextInt();
        try {
            System.out.println("character at position"+position+":"+passengerName.charAt(position));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        sc.close();
    }
    
}
