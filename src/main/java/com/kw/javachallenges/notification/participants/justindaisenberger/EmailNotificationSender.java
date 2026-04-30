package com.kw.javachallenges.notification.participants.justindaisenberger;

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
        return "{email to " + notification.getRecipient().getAddress() + "}: " + notification.getMessage().getContent();
    }
}