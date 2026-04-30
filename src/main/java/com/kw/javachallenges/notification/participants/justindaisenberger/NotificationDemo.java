package com.kw.javachallenges.notification.participants.justindaisenberger;

import com.kw.javachallenges.notification.model.BasicNotification;
import com.kw.javachallenges.notification.model.Channel;
import com.kw.javachallenges.notification.model.TextMessage;
import com.kw.javachallenges.notification.model.UserRecipient;
import com.kw.javachallenges.notification.sender.NotificationSender;
import com.kw.javachallenges.notification.service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class NotificationDemo {

    public static void main(String[] args) {

        List<NotificationSender> senders = new ArrayList<>();
        senders.add(new EmailNotificationSender());
        senders.add(new SmsNotificationSender());

        NotificationService notificationService = new NotificationService(senders);

        UserRecipient recipient1 = new UserRecipient("justin.daisenberger@kiteworks.com");
        UserRecipient recipient2 = new UserRecipient("sg.qateam@accellion.com");

        TextMessage welcomeMessage = new TextMessage("Welcome to the club!");
        TextMessage goodbyeMessage = new TextMessage("See you soon!");

        // both users join the club
        System.out.println(notificationService.sendNotification(new BasicNotification(recipient1, welcomeMessage), Channel.EMAIL));
        System.out.println(notificationService.sendNotification(new BasicNotification(recipient2, welcomeMessage), Channel.SMS));

        // send sms without sms channel sender present
        notificationService = new NotificationService(List.of(new EmailNotificationSender()));
        try {
            System.out.println(notificationService.sendNotification(new BasicNotification(recipient1, goodbyeMessage), Channel.SMS));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(notificationService.sendNotification(new BasicNotification(recipient1, goodbyeMessage), Channel.EMAIL));
    }


}