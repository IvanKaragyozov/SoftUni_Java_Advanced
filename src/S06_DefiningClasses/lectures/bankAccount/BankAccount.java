package S06_DefiningClasses.lectures.bankAccount;

public class BankAccount {

    private static double interestRate = 0.02;
    private static int accountCount = 0;

    private int ID;
    private double balance;

    public BankAccount(){
        accountCount++;
        this.ID = accountCount;
        this.balance = 0;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years){
        return years * interestRate * this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }


}


