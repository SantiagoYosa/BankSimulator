package Bank;

public class Account {
    private String numberAccount;
    private double balance;

    public Account(String numberAccount, double balanceInit) {
        this.numberAccount = numberAccount;
        this.balance = balanceInit;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
