package ex_23042024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
        // Traingle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1, side 2, side3 , I will tell you abou the traingle ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("EQT");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("isoT");

        } else {
            System.out.println("normal ");
        }
    }
}
