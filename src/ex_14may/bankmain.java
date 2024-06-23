package ex_14may;

public class bankmain {
    public static void main(String[] args) {
        BankAcc sbi_ref = new BankAcc();
        sbi_ref.printDetails();

        BankAcc hdfc_ref = new BankAcc("HDFC",10,"HDFC002");
        hdfc_ref.printDetails();
    }
}
