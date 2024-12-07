package org.example.services;

import org.example.model.Message;
import org.example.model.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageService {
    private Message[] messages;
    @Override
    public String toString(){
        return messages[0].getText() + " " + messages[1].getText() + " " + messages[2].getText() + " " + messages[3].getText();
    }
    public String getDate(){
        //Текущее время
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        String dateTime = formattedDateTime;
        return dateTime;
    }

    public Message[] create4Message(User[] users){
        messages = new Message[4];
        messages[0] = send(users[0], users[1], "Hello");
        messages[1] = send(users[1], users[2], "Привет");
        messages[2] = send(users[2], users[3], "Бонжур");
        messages[3] = send(users[3], users[0], "Конишуа");
        return messages;
    }

    public Message send(User sender, User recipient, String text){
        Message message = new Message(sender, recipient, text, getDate());
        return message;
    }
}
