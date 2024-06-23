package ex_may20_abstraction;

public class TC2_FireFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting firefox 1");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing firefox 1");
        return "";
    }
}
