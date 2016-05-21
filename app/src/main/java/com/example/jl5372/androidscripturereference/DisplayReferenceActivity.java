package com.example.jl5372.androidscripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayReferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_reference);

        String favoriteScriptureMessage;
        Intent intent = getIntent();
        String book = intent.getStringExtra(MainActivity.BOOK_TEXT);

        String chapter = intent.getStringExtra(MainActivity.CHAPTER_TEXT);
        String verse = intent.getStringExtra(MainActivity.VERSE_TEXT);
        favoriteScriptureMessage = "Your favorite scripture is: " + book + " " + chapter +
                ":" + verse;
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(favoriteScriptureMessage);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);
    }

}
