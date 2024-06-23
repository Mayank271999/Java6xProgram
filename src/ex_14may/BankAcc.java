package ex_14may;

public class BankAcc {
    String bankName;
    int balance;
    String bankCode;

    public BankAcc(String bankName, int balance, String bankCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    BankAcc(){
        bankName = " SBI";
        bankCode = " sbi001";
        balance = 0 ;
    }

    void printDetails(){
        System.out.println("Bank name --> "+ bankName);
        System.out.println("Bank code -->"+ bankCode);
        System.out.println("balance -->"+ balance);
    }


}
