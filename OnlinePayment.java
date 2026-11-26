public class OnlinePayment {
    public static void main(String[] args){
        String paymentAmount="2500";
        try {
            double amount=Double.parseDouble(paymentAmount);
            System.out.println("payment Amount:"+amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid payment amount");
        }
    }
}
