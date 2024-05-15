package ex_04052024;

public class allTypesOfFunctions {
    public static void main(String[] args) {
         // non return no parameter
        saySomethingPlease();

        // non return with parameter
        sayHelloToYou("mayank");

        // return with no parameter
        sumOfTwoBad(3,4);

        // return with paramters
       int r =  sumOfGood(5,6);
        System.out.println(r);
    }

    static void saySomethingPlease(){
        System.out.println("non return non paramter");
    }
    static void sayHelloToYou(String name){
        System.out.println("hello, "+name);
    }
    static void sumOfTwoBad(int a , int b){
        System.out.println(a+b);
    }
    static int sumOfGood(int c , int d ){
        return c+d;
    }

}