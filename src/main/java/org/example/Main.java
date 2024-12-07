package org.example;
import org.example.model.*;
import org.example.services.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.create4Users();
        MessageService messageService = new MessageService();
        Message messages[] = messageService.create4Message(userService.getUsers());
        for (int i = 0; i < 4; ++i) {
            userService.printUserInfo(userService.getUsers()[i]);
        }
        for (int i = 0; i < 4; ++i){
            System.out.println(messages[i]);
        }
    }
}