package com.example.jl5372.androidscripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String BOOK_TEXT = "com.lavold.MainActivity.BOOKTEXT";
    public final static String CHAPTER_TEXT = "com.lavold.MainActivity.CHAPTERTEXT";
    public final static String VERSE_TEXT = "com.lavold.MainActivity.VERSETEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitReference(View view) {
        Intent intent = new Intent(this, DisplayReferenceActivity.class);
        EditText book = (EditText) findViewById(R.id.book);
        EditText chapter = (EditText) findViewById(R.id.chapter);
        EditText verse = (EditText) findViewById(R.id.verse);
        String bookText = book.getText().toString();
        String chapterText = chapter.getText().toString();
        String verseText = verse.getText().toString();
        intent.putExtra(BOOK_TEXT, bookText);
        intent.putExtra(CHAPTER_TEXT, chapterText);
        intent.putExtra(VERSE_TEXT, verseText);
        startActivity(intent);
    }

}
