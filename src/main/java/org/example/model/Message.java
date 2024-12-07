package org.example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String  text, dateTime;
    private User sender, recipient;
    @Override
    public String toString(){
        return text;
    }
    public Message(){
    }

    public Message(User sender, User recipient, String text, String dateTime){
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.dateTime = dateTime;
    }

    //Getters
    public String getDateTime() {
        return dateTime;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    //Setters
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setText(String text) {
        this.text = text;
    }
}
