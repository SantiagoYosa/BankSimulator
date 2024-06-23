package Bank;

public class BankSimulator {
    public static void main(String[] args) {
        Bank bank = new Bank("Simulated Bank");

        Client client1 = new Client("Santiago Yosa");
        Account account1 = new Account("28062006", 420.0);
        client1.addAccount(account1);

        Client client2 = new Client("Laura León");
        Account account2 = new Account("31052006", 512.0);
        client2.addAccount(account2);

        Client client3 = new Client("Jairo Bonilla");
        Account account3 = new Account("31012005", 911.0);
        client3.addAccount(account3);

        bank.addClient(client1);
        bank.addClient(client2);
        bank.addClient(client3);

        account1.withdraw(20.0);
        account2.deposit(88.0);
        account3.withdraw(911.0);

        System.out.println("Saldo de " + client1.getName() + ": " + account1.getBalance());
        System.out.println("Saldo de " + client2.getName() + ": " + account2.getBalance());
        System.out.println("Saldo de " + client3.getName() + ": " + account3.getBalance());
    }

}
