package ex_27042024;

public class primeNumber {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i %2 == 0){
                System.out.println("even");
                continue;
            }
            System.out.println("odd");
        }

    }
}
