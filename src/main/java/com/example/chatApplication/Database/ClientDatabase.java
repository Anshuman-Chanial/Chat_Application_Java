package com.example.chatApplication.Database;

import com.example.chatApplication.Model.Client;

import java.util.ArrayList;

public class ClientDatabase {
    private static ArrayList<Client> clients = new ArrayList<>();

    private boolean searchClient(int clientId) {
        for (int i = 0; i < clients.size(); i++) {
            Client cl = clients.get(i);
            if (cl.getClientId() == clientId) {
                return true;
            }
        }
        addClient();
    }

    private void addClient() {
        Client clientId = null;
        clients.add(clientId);
    }
}
