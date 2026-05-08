package com.kw.javachallenges.notification.participants.example.lidiya;

import com.kw.javachallenges.notification.model.*;
import com.kw.javachallenges.notification.service.NotificationService;

import java.util.Arrays;

public class NotificationDemo {
    public static void main(String[] args) {

        UserRecipient userRecipient = new UserRecipient("onlyone@test.com");
        TextMessage textMessage = new TextMessage("Your verification code is: 526984");
        BasicNotification basicNotification = new BasicNotification(userRecipient, textMessage);

        EmailNotificationSender userViaEmail = new EmailNotificationSender();
        SmsNotificationSender userViaSms = new SmsNotificationSender();

        NotificationService service = new NotificationService(Arrays.asList(userViaEmail, userViaSms));

        try {
            String emailTest = service.sendNotification(basicNotification, Channel.EMAIL);
            System.out.println("Result -> " + emailTest);
            String smsTest = service.sendNotification(basicNotification, Channel.SMS);
            System.out.println("Result -> " + smsTest);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
