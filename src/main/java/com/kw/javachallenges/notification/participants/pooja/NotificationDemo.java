package com.kw.javachallenges.notification.participants.pooja;

import com.kw.javachallenges.notification.model.BasicNotification;
import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.Notification;
import com.kw.javachallenges.notification.model.TextMessage;
import com.kw.javachallenges.notification.model.UserRecipient;
import com.kw.javachallenges.notification.sender.NotificationSender;
import com.kw.javachallenges.notification.service.NotificationService;

import java.util.Arrays;

public class NotificationDemo {

    public static void main(String[] args) {

        NotificationSender smsSender = new SMSNotificationSender();
        NotificationSender callSender = new CallNotificationSender();

        NotificationService service = new NotificationService(Arrays.asList(smsSender, callSender));

        System.out.println("=== Notification Demo - Pooja ===");

        Notification notification = new BasicNotification(
                new UserRecipient("Pooja"),
                new TextMessage("Hello, this is a test notification from Pooja's class!")
        );

        try {
            String smsResult = service.sendNotification(notification, Channel.SMS);
            System.out.println("SMS demo: " + smsResult);

            String callResult = service.sendNotification(notification, Channel.CALL);
            System.out.println("Call demo: " + callResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
