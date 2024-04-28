package ex_23042024;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        // else if

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 20){
            System.out.println("num>20");
        } else if (number> 10) {
            System.out.println("number is btw 10 and 20");

        }else {
            System.out.println("number < 20");
        }

    }
}
