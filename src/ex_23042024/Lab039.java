package ex_23042024;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        System.out.println(" enter num 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("enter num 2");
        int num2 =sc.nextInt();

        if (num1>num2){
            System.out.println("num1 is max ");
        }else {
            System.out.println("num2 is greater");
        }
        sc.close();
    }
}
