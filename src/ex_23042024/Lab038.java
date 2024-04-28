package ex_23042024;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {

        //Taking input from user

        Scanner sc =   new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number ");
        }
    }
}
