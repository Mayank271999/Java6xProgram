package ex_23042024;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        int number = sc.nextInt();

        if (number %3 == 0 ){
            System.out.println("Fizz");
        }  if (number%5==0) {
            System.out.println("buzz");

        }  if ( number%3 ==0 && number%5==0 ) {
            System.out.println("Fizzbuzz");

        }else {
            System.out.println("normal");
        }
    }
}
