package com.kw.javachallenges.notification.participants.example;

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

        NotificationSender emailSender = new EmailNotificationSender();
        NotificationSender smsSender = new SmsNotificationSender();

        NotificationService service = new NotificationService(Arrays.asList(emailSender, smsSender));

        System.out.println("=== Notification System Demo (Stage 3) ===");

        Notification notification = new BasicNotification(
                new UserRecipient("john@example.com"),
                new TextMessage("Hello, this is a test notification!")
        );

        try {
            String emailResult = service.sendNotification(notification, Channel.EMAIL);
            System.out.println("Email demo: " + emailResult);

            String smsResult = service.sendNotification(notification, Channel.SMS);
            System.out.println("SMS demo: " + smsResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}