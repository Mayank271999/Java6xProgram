package ex_25042024;

public class Lab083 {
    public static void main(String[] args) {
        char ch = 'z';
        switch (ch){
            case 'a', 'e', 'i' -> System.out.println("vowel");
            default -> System.out.println("constant");


        }
    }
}
