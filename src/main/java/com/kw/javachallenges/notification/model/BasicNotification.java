package com.kw.javachallenges.notification.model;

public class BasicNotification implements Notification {
    private final Recipient recipient;
    private final Message message;

    public BasicNotification(Recipient recipient, Message message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public Recipient getRecipient() {
        return recipient;
    }

    @Override
    public Message getMessage() {
        return message;
    }
}