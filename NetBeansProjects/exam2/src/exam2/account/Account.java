
package exam2.account;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance=" + balance + '}';
    }
    
    public static void deposit() {
        
    }
    public static void displayAccountInfo(){  
    }
    }
    
    
   

    
     

