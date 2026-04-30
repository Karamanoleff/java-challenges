package com.kw.javachallenges.notification.participants.justindaisenberger;

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
        return "{sms to " + notification.getRecipient().getAddress() + "}: " + notification.getMessage().getContent();
    }
}