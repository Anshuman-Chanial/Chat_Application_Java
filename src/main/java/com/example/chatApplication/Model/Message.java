package com.example.chatApplication.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Message {
    private static ArrayList<ArrayList<String>> messages = new ArrayList<>();

    public static void addMsg(int clientId, String name, String msg) {
        ArrayList<String> newMessage = new ArrayList<>();
        newMessage.add(String.valueOf(clientId));
        newMessage.add(name);
        newMessage.add(msg);
        messages.add(newMessage);
    }

    private void viewMessages() {
        for (ArrayList<String> message : messages) {
            String id = message.get(0);
            String name = message.get(1);
            String msg = message.get(2);

            System.out.println(id + ": " + name + ": " + msg);
        }
    }
}
