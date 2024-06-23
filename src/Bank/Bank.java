package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client searchClient(String name) {
            for(Client client: clients) {
                if(client.getName().equalsIgnoreCase(name)) {
                    return client;
                }
            }
            return null;
    }
}
