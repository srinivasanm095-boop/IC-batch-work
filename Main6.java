class Printer{
    void print(String text){
        System.out.println("Text: " + text);
    }
    void print(int number){
        System.out.println("Integer: " + number);
    }
    void print(double decimal){
        System.out.println("Decimal: " + decimal);
    }
}
public class Main6 {
    public static void main(String[] args){
        Printer p=new Printer();
        p.print("ic batch classs");
        p.print(5);
        p.print(5.0);
    }
}
