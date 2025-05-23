package com.example.chatApplication.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client extends Thread {
    private static int id = 101;
    private int clientId;
    private String name;
    private int serverId;
    private String msg;

    private Client(String name, int serverId, String msg) {
        clientId = id++;
        this.name = name;
        this.serverId = serverId;
        this.msg = msg;
    }

    private void sendMsg(String msg) {
        Server.storeMsg(clientId, name, msg);
    }
}
