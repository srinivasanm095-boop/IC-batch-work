public class EmailValidation {
    public static void main(String[] args){
        String email="student123@gmail.com";
        System.out.println("Email: "+email);
        if(!email.isEmpty() && email.contains("@") && email.endsWith(".com") && email.startsWith("student")){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}