class Car extends Vehicle
{
    public void displaydetails()
    {
        String Modelname="BMW";
        String Brand="BMW";
        System.out.println("Car Model: "+Modelname);
        System.out.println("Car Brand: "+Brand);
    }
}
class Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displaydetails();

    }
}