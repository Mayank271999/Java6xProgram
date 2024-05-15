package ex_04052024;

public class max_in_array {
    public static void main(String[] args) {
        int [] salaries = {30,40,50,100,999};
        int max_sal = Integer.MIN_VALUE;

        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i] > max_sal){
                max_sal = salaries[i];
            }

        }
        System.out.println("max sal " + max_sal);
    }
}
