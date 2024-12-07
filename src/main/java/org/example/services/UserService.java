package org.example.services;

import org.example.model.User;

public class UserService {
    private User[] users = new User[4];

    public void create4Users() {
        users[0] = new User("Mike", "Михаил", "88005553535", "123");
    }

}
