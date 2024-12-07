package org.example;
import org.example.model.*;
import org.example.services.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.create4Users();
        MessageService messageService = new MessageService();
        messageService.create4Message(userService.getUsers());
        userService.printUserInfo(userService.getUsers()[0]);
    }
}