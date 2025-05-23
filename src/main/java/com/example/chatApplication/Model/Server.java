package com.example.chatApplication.Model;

import java.util.ArrayList;

public class Server {
    private int serverId;
    private String password;
    private static ArrayList<Client> clients = new ArrayList<>();
    private static ArrayList<Server> servers = new ArrayList<>();

    private Server(int id, String pass) {
        serverId = id;
        password = pass;
    }

    public static void storeMsg(int clientId, String name, String msg) {
        for (int i = 0; i < clients.size(); i++) {
            Client cl = clients.get(i);
            if (cl.getClientId() == clientId) {
                Message.addMsg(clientId, name, msg);
            }
        }
    }

    private void addClient(Client c) {
        clients.add(c);
    }

    private void addServer(Server s) {
        servers.add(s);
    }
}
