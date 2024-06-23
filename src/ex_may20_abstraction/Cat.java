package ex_may20_abstraction;

public class Cat {
//  Non-static  all of them only apply individual object not cat class
    public static final int MAX_LIVES = 9;

    private static int catCount = 0 ;

    String name ;

    int age ;

    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }
    public Cat() {
        catCount++;
        livesRemaining = MAX_LIVES;
    }
    public static int getCatCount(){

        return catCount;
    }
}
