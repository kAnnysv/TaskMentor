package org.example.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class User {
   private UUID id;
    private String userName;
    private List<User> subscriptions;
    private List<User> friends;

    public User(String userName){
        this.id = UUID.randomUUID();
        this.userName = userName;
        List<User> subscriptions = new ArrayList<>();

    }
    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        return subscriptions.stream().anyMatch(s -> s.getId().equals(user.getId()));

    }
    public boolean isFriend(User user){
        return friends.stream().anyMatch(x -> x.getId().equals(user.getId()));
    }
    public void sendMessage(User user, String text){
        MessageDB.setMessages(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName;

    }
}
