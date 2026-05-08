package com.kw.javachallenges.notification.participants.example.lidiya;

import com.kw.javachallenges.notification.model.BasicNotification;
import com.kw.javachallenges.notification.model.TextMessage;
import com.kw.javachallenges.notification.model.UserRecipient;
import com.kw.javachallenges.notification.service.NotificationService;

import java.util.ArrayList;
import java.util.Arrays;

public class NotificationDemo {
    public static void main(String[] args) {

        UserRecipient userRecipient = new UserRecipient("onlyone@test.com");
        TextMessage textMessage = new TextMessage("Your verification code is: 526984");
        BasicNotification basicNotification = new BasicNotification(userRecipient, textMessage);

        EmailNotificationSender userViaEmail = new EmailNotificationSender();
        SmsNotificationSender userViaSms = new SmsNotificationSender();

        NotificationService service = new NotificationService(Arrays.asList(userViaEmail, userViaSms));}


}
