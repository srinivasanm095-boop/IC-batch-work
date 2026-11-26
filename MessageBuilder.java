public class MessageBuilder {
    public static void main(String[] args){
        String firstName="Java";
        String lastName="Developer";

        MessageBuilder obj = new MessageBuilder();

        String result = firstName.concat(" ").concat(lastName);

        System.out.println("Welcome, "+result);
    }
}