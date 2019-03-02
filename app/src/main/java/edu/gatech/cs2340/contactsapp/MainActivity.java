package edu.gatech.cs2340.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mainView;
    private RecyclerView.Adapter mainViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainView = findViewById(R.id.main_view);
        mainView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        mainView.setLayoutManager(layoutManager);

        //Create data
        List<Contact> contactData = new ArrayList<>();
        contactData.add(new Contact("Jack"));
        contactData.add(new Contact("Dianne"));
        contactData.add(new Contact("Emma"));
        contactData.add(new Contact(
                "Paul",
                "Gibert",
                "9802547515",
                Contact.PhoneType.MOBILE));
        contactData.add(new Contact("Will"));
        contactData.add(new Contact("Thomas"));

        mainViewAdapter = new ContactAdapter(contactData);
        mainView.setAdapter(mainViewAdapter);
    }
}
