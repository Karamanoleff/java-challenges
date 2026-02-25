package com.kw.javachallenges.notification.model;

public class TextMessage implements Message {
    private final String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}