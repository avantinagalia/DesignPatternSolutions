package com.patterns.solution.adapter.Gmail;

public class GmailProvider {
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    public void getEmails() {
        System.out.println("Downloading emails from Gmail");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
