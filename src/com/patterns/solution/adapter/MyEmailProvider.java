package com.patterns.solution.adapter;

import com.patterns.solution.adapter.EmailProvider;

public class MyEmailProvider implements EmailProvider {
    @Override
    public void downloadEmails() {
        System.out.println("Downloading emails from MyEmailProvider");
    }
}
