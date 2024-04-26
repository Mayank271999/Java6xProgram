package ex_18042024;

public class Lab029 {
    public static void main(String[] args) {
        int age_mayank = 30;
        int age_pramod = 34;
        boolean result = age_pramod > age_mayank; // relational operators --> always give true or false <> =
        System.out.println(result);

        // Logical operartor
        // Or gate || , not gate (!), and gate &&

        int x = 12;
        boolean y = !(x > 10 || x < 5);
        // boolean b  = !(true || false )
        // boolean b = !(true)
        // boolean b = false
        System.out.println(y);  // Output is false



    }
}
