package com.kw.javachallenges.notification.sender;

import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;

public interface NotificationSender {
    Channel getChannel();
    String send(Notification notification);
}