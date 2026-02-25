package com.kw.javachallenges.notification.model;

public class UserRecipient implements Recipient {
    private final String address;

    public UserRecipient(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }
}