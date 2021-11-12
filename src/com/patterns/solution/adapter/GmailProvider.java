package com.patterns.solution.adapter;

import com.patterns.solution.adapter.Gmail.GmailService;

public class GmailProvider implements EmailProvider {
    private GmailService gmail;

    public GmailProvider(GmailService gmailService) { gmail = gmailService; }

    @Override
    public void downloadEmails() {
        gmail.connect();
        gmail.getEmails();
        gmail.disconnect();
    }
}
