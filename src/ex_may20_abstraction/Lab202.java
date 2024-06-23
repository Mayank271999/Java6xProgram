package ex_may20_abstraction;

public class Lab202 {
    public void main(String[] args) {
        person p1 = new person("Amit");
        System.out.println(person.footBallClub);
    }

    class person {
         static String footBallClub = " Aresnal";
        {
            System.out.println("iib");
        }
        String name ;// non static always since it is not common

        public person(String name) {
            this.name = name;
        }
    }
}
