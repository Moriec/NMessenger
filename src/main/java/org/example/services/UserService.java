package org.example.services;

import org.example.model.User;

public class UserService {
    private User[] users = new User[4];

    public void create4Users() {
        users[0] = new User("Mike", "Михаил", "88005553535", "123");
        users[1] = new User();
        users[1].setNickname("Fazam");
        users[1].setUsername("Амир");
        users[1].setPhone("+76354634635");
        users[1].setPassword("5236742");
        users[2] = new User("ДИМООООООН", "Дмитрий", "+73247524567", "6234");
        users[3] = new User("Олег", "Антон", "+76384667348", "87364");
    }

    public User[] getUsers() {
        return users;
    }

    public void printUserInfo(User user) {
        System.out.print("Никнейм: " + user.getNickname() + ", Имя: " + user.getUsername());
        System.out.print(", Телефон: " + user.getPhone() + ", Пароль: " + user.getPassword());
        System.out.println();
    }

}
