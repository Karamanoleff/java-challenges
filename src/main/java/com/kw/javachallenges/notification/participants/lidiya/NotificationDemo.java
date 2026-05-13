package com.kw.javachallenges.notification.participants.lidiya;

import com.kw.javachallenges.notification.model.*;
import com.kw.javachallenges.notification.sender.NotificationSender;
import com.kw.javachallenges.notification.service.NotificationService;

import java.util.Arrays;

public class NotificationDemo {
    public static void main(String[] args) {

        NotificationSender emailSender = new EmailNotificationSender();
        NotificationSender smsSender = new SmsNotificationSender();

        NotificationService service = new NotificationService(Arrays.asList(emailSender, smsSender));

        Notification notification = new BasicNotification(
        new UserRecipient("onlyone@test.com"),
        new TextMessage("Your verification code is: 526984")
        );

        try {
            String emailResult = service.sendNotification(notification, Channel.EMAIL);
            System.out.println("Email demo -> " + emailResult);

            String smsResult = service.sendNotification(notification, Channel.SMS);
            System.out.println("SMS demo ->  " + smsResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
