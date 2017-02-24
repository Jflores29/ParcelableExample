package com.javier.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textView= (TextView) findViewById(R.id.actB_tv);

        Intent intent = getIntent();
        Book book = intent.getExtras().getParcelable("pass");
        textView.setText(book.getBookname().toString()+" by "+
        book.getAuthor().toString());

    }
}
