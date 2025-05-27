public class BankAccount {
    private String accountNo;
    private Double balance;
    private String accountHolderName;

    public BankAccount(String accountNo, Double balance, String accountHolderName) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(Double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully\nAvailable balance: " + this.balance);
        
    }

    public void withdraw(Double amount) {
        if(this.balance >= amount) 
            this.balance -= amount;
        System.out.println("Insufficient balance");
    }

}
