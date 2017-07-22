package com.example.minlay.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ZodiacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        Intent intent = getIntent();
        Zodiac theZodiac = (Zodiac)intent.getSerializableExtra("TheZodiac");

        ImageView zodiac_image = (ImageView)findViewById(R.id.zodiac_image);
        zodiac_image.setImageResource((int)theZodiac.pic);

        TextView zodiac_title = (TextView)findViewById(R.id.zodiac_title_text);
        zodiac_title.setText(theZodiac.name);

        TextView textView = (TextView)findViewById(R.id.textViewZA);
        textView.setText(theZodiac.info);
    }
}
