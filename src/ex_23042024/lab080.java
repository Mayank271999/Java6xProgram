package ex_23042024;

import java.util.Scanner;

public class lab080 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a character");
        char ch=sc.next().charAt(0);

        if(ch =='a' || ch =='e' || ch =='i'|| ch =='o'|| ch =='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Its a vowel -" + ch);
        }
        else {
            System.out.println("Its a consonant -" + ch);
        }
    }
}
