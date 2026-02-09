package bankaccount;

import bankaccount.account.AccountStatus1;

public class BankAccount {

    public static void main(String[] args) {
        AccountStatus1 input=new AccountStatus1();
        input.setDeposit(1000);
        input.diposit();
        System.out.println("Diposit Ammount "+ input.getBalance());
        
        input.setWithdraw(800);
        input.withdraw();
        System.out.println("Withdrow Ammount "+input.getWithdraw());
        
        System.out.println("Current Balance "+input.getBalance());
        
         input.setWithdraw(100);
        input.withdraw();
        System.out.println("Withdrow Ammount "+input.getWithdraw());
        
        input.setDeposit(500);
        input.diposit();
        System.out.println("Diposit Ammount "+ input.getBalance());
        
        input.setWithdraw(300);
        input.withdraw();
        System.out.println("Withdrow Ammount "+input.getWithdraw());
        
         System.out.println("Current Balance "+input.getBalance());
        
    }

}
