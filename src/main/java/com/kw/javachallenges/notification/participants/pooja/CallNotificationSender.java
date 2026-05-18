package com.kw.javachallenges.notification.participants.pooja;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.sender.NotificationSender;

public class CallNotificationSender implements NotificationSender {

    @Override
    public Channel getChannel() {
        return Channel.CALL;
    }

    @Override
    public String send(Notification notification) {
        return "Call sent to "+ notification.getRecipient().getAddress()+ " with message -- "+ notification.getMessage().getContent();
    }


}
