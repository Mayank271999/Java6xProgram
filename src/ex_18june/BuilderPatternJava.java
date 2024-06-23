package ex_18june;

public class BuilderPatternJava {

    public BuilderPatternJava groundFloor() {
        System.out.println("do some task of ground floor ");
        return this;

    }
    public BuilderPatternJava firstFloor(String name ){
        System.out.println("do some task "+ name);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternJava bp = new BuilderPatternJava();
        bp.groundFloor().firstFloor("FF");
    }
}
