import java.util.Scanner;
public class EcommerceOrderProcessing {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String ProductName="laptop";
    String quality="2";
    double[] ProductPrices={45000,55000,65000};
    try {
        int qty=Integer.parseInt(quality);
        System.out.println("productName:"+ProductName);
        System.out.println("Enter user to productPosition:");
        int p=sc.nextInt();
        double ProductPrice=ProductPrices[p];
        double total=qty*ProductPrice;
        System.out.println("product price:"+ProductPrice);
        System.out.println("Quality:"+qty);
        System.out.println("Total price:"+total);
    } catch (NumberFormatException e) {
        System.out.println("Invalid quality");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid product position");
    }
    finally{
        System.out.println("Order completed");
    }
}
}