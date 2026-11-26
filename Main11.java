public class Main11 {
    public static void main(String[] args){
        String d="IC batch work";
        String d1="IC batch work";
        System.out.println("length:"+d.length());
        System.out.println("uppercase:"+d.toUpperCase());
        System.out.println("Lowercase:"+d.toLowerCase());
        for (int i = 0; i <d.length(); i++) {
            System.out.println(d.charAt(i));
            
        }
        System.out.println(d1.equals(d));

    }
}
