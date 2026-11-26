
public class WordAnalyzer {
    public static void main(String[] args) {
        String word = "banana";
        System.out.println("Original: " + word);
        System.out.println("Last occurrence of a: " + word.lastIndexOf('a'));
        System.out.println("Last occurrence of n: " + word.lastIndexOf('n'));
        System.out.println("First occurrence of a: " + word.indexOf('a'));
        System.out.println("First occurrence of n: " + word.indexOf('n'));
    }
}
