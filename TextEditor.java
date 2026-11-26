public class TextEditor {
    public static void main(String[] args){
        String sentence="I love python programming";
        System.out.println("replace the word:"+sentence.replace("python", "java"));
        System.out.println("replace all the word:"+sentence.replace('o', '0'));
        System.out.println("original sentence:"+sentence);
    }
}
