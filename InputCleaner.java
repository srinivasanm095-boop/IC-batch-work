public class InputCleaner {
    public static void main(String[] args) {
        String username = "  JavaDeveloper  ";
        System.out.println("original string length: " + username.length());
        System.out.println("cleaned string length: " + username.trim().length());
        System.out.println("cleaned username: " + username.trim());
    }
}