package org.example;
import org.example.model.*;
import org.example.services.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        MessageService messageService = new MessageService();
        userService.printUserInfo(userService.getUsers()[0]);
    }
}