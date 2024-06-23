package ex_14may;

public class inheritabce {


    // child extends parent{}
     int version ;
     String author ;

    public inheritabce(int version, String author) {
        this.version = version;
        this.author = author;
    }
    inheritabce(){
        System.out.println("dc");
    }

    void printInfo(){
        System.out.println("prpgramming info -->" + this.version + "Author" + this.author);
    }
}
