package com.javier.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Book book;
    public final static  String PAR_KEY = "pass";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void intentMagic(View view) {
        book = new Book();
        book.setBookname("A Dance With Dragons");
        book.setAuthor("George R. R. Martin");
        book.setPublishTime(2011);
        Intent i = new Intent(MainActivity.this, ActivityB.class);

        i.putExtra(PAR_KEY,book);
        startActivity(i);
    }
}
