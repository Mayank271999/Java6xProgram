package ex_04052024;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // string is palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string , I will check if it is palindrome or not");
        String user_input = sc.next();

        StringBuilder sb =  new StringBuilder(user_input);
        String rev_user_input =  sb.reverse().toString(); //  reverse function doest return anything thats y we have to covert it into to.string
        if(user_input.equalsIgnoreCase(rev_user_input)){ // ignore case --> it will ignore lower and upper case
            System.out.println("palindrome");
        }else {
            System.out.println("nope");
        }
    }
}
