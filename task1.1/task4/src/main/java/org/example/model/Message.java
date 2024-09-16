package org.example.model;

import lombok.Getter;

import java.util.Date;
@Getter
public class Message {
    private User sender;
    private User receiver;
    private Date date;

    private String text;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM" + sender + '\'' +
                ", TO=" + receiver + '\'' +
                ", ON: date=" + date + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
