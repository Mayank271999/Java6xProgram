package ex_14may;

public class superkey {
    public static void main(String[] args) {
Car c = new Car();
c.display();
    }
}
class Car extends vehicle{
    void display(){
        System.out.println("max speed of car can be "+super.maxSpeed);
    }
}
class vehicle  {
    int maxSpeed = 100 ;  // instance variable

    void message(){
        System.out.println("this is vehicle class");
    }
}