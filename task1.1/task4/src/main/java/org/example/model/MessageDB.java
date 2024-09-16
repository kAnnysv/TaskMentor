package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class MessageDB {
    private static List<Message> messages = new ArrayList<>();

    public static void setMessages(User u1, User u2, String text){
        messages.add(new Message(u1,u2, text));

    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for(Message ms: messages){
            if(ms.getSender().getId() == u1.getId() && ms.getReceiver().getId() == u2.getId()){
                System.out.println(u1.getUserName() + " : " + ms.getText());
            }
            else if(ms.getSender().getId() == u2.getId() && ms.getReceiver().getId() == u1.getId()){
                System.out.println(u2.getUserName() + " : " + ms.getText());
            }

        }
    }
}
