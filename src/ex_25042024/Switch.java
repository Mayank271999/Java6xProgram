package ex_25042024;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // web automation
        // i will ask user which browser u want me to run the code
        // if he says chrome --

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the browser name!!");

        String browserName = sc.next();
        browserName =  browserName.toLowerCase(Locale.ROOT);

        switch (browserName){
            case "Chrome":
                System.out.println("strating the chrome");
                break;
            case  "firefox":
                System.out.println("starting firefox");
                break;
        }
    }
}
