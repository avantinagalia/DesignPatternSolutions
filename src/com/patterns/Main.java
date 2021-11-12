package com.patterns;

import com.patterns.solution.observer.Chart;
import com.patterns.solution.observer.DataSource;
import com.patterns.solution.observer.SpreadSheet;
import com.patterns.solution.adapter.EmailClient;
import com.patterns.solution.adapter.GmailAdapter;
import com.patterns.solution.adapter.MyEmailProvider;
import com.patterns.solution.observer.Chart;
import com.patterns.solution.observer.DataSource;
import com.patterns.solution.observer.SpreadSheet;
import com.patterns.solution.prototype.ContextMenu;
import com.patterns.solution.prototype.Presentation;
import com.patterns.solution.prototype.TextBox;
import com.patterns.solution.singleton.ConfigurationManager;

public class Main {

    public static void main(String[] args) {
        //Observer
        //System.out.println("Demoing Observer:");
        DataSource dataSource = new DataSource();
        dataSource.addObserver(new Chart(dataSource));
        dataSource.addObserver(new SpreadSheet(dataSource));
        dataSource.addObserver(new SpreadSheet(dataSource));

        dataSource.setValue(6);

        System.out.println("Demoing Adapter:");
        EmailClient client = new EmailClient();
        client.addProvider(new MyEmailProvider());
        client.addProvider(new GmailAdapter());
        client.downloadEmails();

        System.out.println("Demoing Prototype:");
        Presentation presentation = new Presentation();
        TextBox textBox = new TextBox("Design Patterns");
        presentation.add(textBox);
        ContextMenu menu = new ContextMenu(presentation);
        menu.duplicate(textBox);
        menu.duplicate(textBox);

        System.out.println("Demoing Singleton:");
        ConfigurationManager manager = ConfigurationManager.getInstance();
        manager.set("name", "Avanti");

        ConfigurationManager other = ConfigurationManager.getInstance();
        System.out.println(manager.get("name"));
    }
}
