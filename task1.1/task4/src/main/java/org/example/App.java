package org.example;

import org.example.model.MessageDB;
import org.example.model.User;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "kak dela?");

        user2.sendMessage(user1, "zdorovo");
        user2.sendMessage(user1, "good");
        user2.sendMessage(user1, "a tvoi kak dela?");

        user1.sendMessage(user3, "Priva");
        user1.sendMessage(user3, "go ");
        user1.sendMessage(user3, "na rabotu");

        user3.sendMessage(user1, "Privet");

        MessageDB.showDialog(user1, user3);





    }
}
