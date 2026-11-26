public class FormValidator {
    public static void main(String[] args){
        String name="";
        System.out.println("Empty string:"+name.isEmpty());
        if(name.isEmpty()){
            System.out.println("Name is required");
        }
        else{
            System.out.println("name is submitted successfully");
        }
    }
}
