public class Exception {
    public static void main(String[] args) {
        try {
            String num="abc";
            int number=Integer.parseInt(num);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Number is out !");
        }
        finally{
            System.out.println("finally");
        }
    }
    
}
