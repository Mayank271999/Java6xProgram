package ex_27042024;

public class Lab102 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i %2 == 0){
                System.out.println("even" + i);
                continue;
            }
            System.out.println("odd" + i  );
    }
}}
