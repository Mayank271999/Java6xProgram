package ex_14may;

public class single extends inheritabce{
    public single(String newFeature) {
        this.newFeature = newFeature;
    }

    // single inheritance
    // java is a type of programming language
    // python is also a programming language
String newFeature;
    public single() {
        System.out.println("dc");
    }

    void PrintInfo(){
        System.out.println("feature is --> "+ this.newFeature);
    }
}
