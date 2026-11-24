class Bank{
    double getInterestRate(){
        return 0.0;
    }
}
class Sbi extends Bank{
    @Override 
    double getInterestRate(){
        return 6.5;
    }
}
class Hdfc extends Bank{
    @Override 
    double getInterestRate(){
        return 7.0;
    }

}
public class Main7 {
    public static void main(String[] args){
        Bank b=new Bank();
        b=new Sbi();
        System.out.println(b.getInterestRate());
        b=new Hdfc();
        System.out.println(b.getInterestRate());
    }
}
