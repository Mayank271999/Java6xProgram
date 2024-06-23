package ex_may20_abstraction;

public class TC1_Chrome extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting Chrome");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing Chrome");
        return "";
    }
}
