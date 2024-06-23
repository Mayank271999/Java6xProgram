package ex_14may;

public class abtPerson {

    String name;
    long phone;
    String email ;

    public abtPerson(long phone, String name, String email, boolean isMarried, String courseName) {
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.isMarried = isMarried;
        CourseName = courseName;
    }

    boolean isMarried;
    String CourseName;

    void printDetails(){
        System.out.println("Printing details of student ");
    }


}
