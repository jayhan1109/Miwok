package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.category_numbers);
        setContentView(R.layout.activity_numbers);

        //Create an array of words
        ArrayList<String> words=new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // find a root View of the whole layout
        LinearLayout rootView= (LinearLayout)findViewById(R.id.rootView);

        for(int i=0;i<words.size();i++) {
            // Create a new TextView
            TextView textView = new TextView(this);

            // Set the current word to text View
            textView.setText(words.get(i));

            // Add this TextView to root view of this layout
            rootView.addView(textView);
        }

    }
}
