package com.patterns.solution.adapter;

import com.patterns.solution.adapter.Gmail.GmailProvider;

public class GmailAdapter implements EmailProvider {
    private GmailProvider client = new GmailProvider();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
