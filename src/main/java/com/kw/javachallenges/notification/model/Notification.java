package com.kw.javachallenges.notification.model;

public interface Notification {
    Recipient getRecipient();
    Message getMessage();
}