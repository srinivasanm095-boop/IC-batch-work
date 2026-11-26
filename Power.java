public class Power{
        String password="@123";
        String confirmpassword="@123";
      
public void display(){
    if(password.equals(confirmpassword)){
        System.out.println("matching");

    }
    else{
        System.out.println("not matching");
    }
    
        }
    }
class Main{
    public static void main(String[] args) {
       Power ob =new Power();
         ob.display();



    }
}