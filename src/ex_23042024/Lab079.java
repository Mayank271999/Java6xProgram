package ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        // positive number and negative number

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number i will tell if it is a positive or negative ");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println(" it is a positive number ");
        } else if (number < 0) {
            System.out.println(" it is a negative number ");

        } else {
            System.out.println(" number is 0");
        }
    }
}
