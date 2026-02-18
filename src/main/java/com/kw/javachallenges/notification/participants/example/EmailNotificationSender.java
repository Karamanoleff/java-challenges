package com.kw.javachallenges.notification.participants.example;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.sender.NotificationSender;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public Channel getChannel() {
        return Channel.EMAIL;
    }

    @Override
    public String send(Notification notification) {
        return "Email sent to " + notification.getRecipient().getAddress() + ": " + notification.getMessage().getContent();
    }
}