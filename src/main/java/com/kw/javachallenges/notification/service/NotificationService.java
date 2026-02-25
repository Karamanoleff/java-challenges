package com.kw.javachallenges.notification.service;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.sender.NotificationSender;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NotificationService {
    private final Map<Channel, NotificationSender> senders;

    public NotificationService(Collection<NotificationSender> senders) {
        this.senders = new HashMap<>();
        for (NotificationSender sender : senders) {
            this.senders.put(sender.getChannel(), sender);
        }
    }

    public String sendNotification(Notification notification, Channel channel) {
        NotificationSender sender = senders.get(channel);
        if (sender == null) {
            throw new IllegalArgumentException("Unknown channel: " + channel);
        }
        return sender.send(notification);
    }
}