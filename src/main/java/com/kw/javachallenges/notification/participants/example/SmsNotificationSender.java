package com.kw.javachallenges.notification.participants.example;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.sender.NotificationSender;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public Channel getChannel() {
        return Channel.SMS;
    }

    @Override
    public String send(Notification notification) {
        return "SMS sent to " + notification.getRecipient().getAddress() + ": " + notification.getMessage().getContent();
    }
}