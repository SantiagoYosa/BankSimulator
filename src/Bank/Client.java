package Bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Account> accounts;

    public Client(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}