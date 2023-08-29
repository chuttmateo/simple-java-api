package com.example.simplejavaapi;

import com.example.simplejavaapi.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FakeDB {
    private final Map<Integer, User> userMap;

    public FakeDB() {
        userMap = new HashMap<>();

        User user1 = new User(1, "John", "Doe");
        User user2 = new User(2, "Jane", "Smith");
        User user3 = new User(3, "Michael", "Johnson");
        User user4 = new User(4, "Emily", "Brown");

        userMap.put(user1.getId(), user1);
        userMap.put(user2.getId(), user2);
        userMap.put(user3.getId(), user3);
        userMap.put(user4.getId(), user4);
    }

    public User addUser(User user) {
        userMap.put(user.getId(), user);
        return userMap.get(user.getId());
    }

    public User getUser(int userId) {
        return userMap.get(userId);
    }

    public void deleteUser(int userId) {
        userMap.remove(userId);
    }

    public List<User> listAllUsers() {
        System.out.println(userMap.values());
        return userMap.values().stream()
                .map(user -> new User(
                        user.getId(),
                        user.getName(),
                        user.lastName))
                .toList();
    }

}
