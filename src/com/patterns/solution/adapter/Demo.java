package com.patterns.solution.adapter;

import com.patterns.solution.adapter.Gmail.GmailService;

public class Demo {
    public static void show() {
        var client = new EmailClient();
        client.addProvider(new MyEmailProvider());
        client.addProvider(new GmailProvider(new GmailService()));
        client.downloadEmails();
    }
}
