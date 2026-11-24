class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    } 
}
class Square extends Shape{
    @Override 
    void  draw(){
        System.out.println("Drawing a square");
    } 
}
public class Main8 {
    public static void main(String[] args){
        Shape s=new Shape();
        s.draw();
        s = new Circle();
        s.draw();
        s=new Square();
        s.draw();
    }
}
