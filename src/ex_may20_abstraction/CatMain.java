package ex_may20_abstraction;

public class CatMain {
    public static void main(String[] args) {

        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();  //  non static it is applied on object
       // cat.meow--> see this is wrong . since cat is classs
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.getCatCount());



    }
}
