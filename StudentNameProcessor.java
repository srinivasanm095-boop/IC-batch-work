public class StudentNameProcessor {
    public static void main(String[] args){
        String fullName = " rahul kumar ";
        System.out.println("Original name: " + fullName);
        String cleanedName = fullName.trim();
        System.out.println("Cleaned name: " + cleanedName);
        String upperName = cleanedName.toUpperCase();
        System.out.println("Uppercase name: " + upperName);
        System.out.println("Total characters: " + cleanedName.length());
        System.out.println("First name: " + cleanedName.substring(0, cleanedName.indexOf(" ")));
        System.out.println("Last name: " + cleanedName.substring(cleanedName.indexOf(" ") + 1));
        if(upperName.startsWith("RAHUL")){
            System.out.println("Validation result: Valid name");
        }
        else{
            System.out.println("Validation result: Invalid name");
        }
    }
}