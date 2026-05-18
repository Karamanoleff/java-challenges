package com.kw.javachallenges.notification.participants.pooja;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.sender.NotificationSender;

public class SMSNotificationSender implements NotificationSender {
    public Channel getChannel(){
        return Channel.SMS;
    }

    @Override
    public String send(Notification notification) {
        return "SMS sent to "+ notification.getRecipient().getAddress()+ " with message -- "+ notification.getMessage().getContent();
    }


}
