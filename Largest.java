import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a vakue:");
        a=sc.nextInt();
        System.out.println("enter b value:");
        b=sc.nextInt();
        System.out.println("enter c value:");
        c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println("you entered a value is largest:"+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("you entered b value is largest:"+b);
        }
        else{
            System.out.println("you entered c value is largest:+c");
        }

    }
    
}
