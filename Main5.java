class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Main5 {
    public static void main(String[] args){
        Calculator s=new Calculator();
        s.add(2,4);
        s.add(45,32,12);
    }
}
