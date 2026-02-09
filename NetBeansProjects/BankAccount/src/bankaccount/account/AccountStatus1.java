
package bankaccount.account;

public class AccountStatus1 {
  private int accNo;
  private double balance;
  private int deposit;
  private double withdraw;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
   public double diposit(){
   balance=balance+deposit;
   return balance;
   }
 public double withdraw(){
 if(balance>=withdraw){
 balance=balance-withdraw;
 }else{
     System.out.println("insufficient amount");
 }
 return balance;
 }
}