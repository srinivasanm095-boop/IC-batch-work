public class EmailChecker {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        if (email.contains("@")) {
            System.out.println("Email contains @");
        } else {
            System.out.println("Email does not contain @");
        }
        if (email.contains("gmail")) {
            System.out.println("Email contains gmail");
        } else {
            System.out.println("Email does not contain gmail");
        }
    }
}