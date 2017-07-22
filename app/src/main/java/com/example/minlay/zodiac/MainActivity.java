package com.example.minlay.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("Zodiac");

        final ListView listView = (ListView)findViewById(R.id.zodiacList);

        ArrayList<Zodiac> zodiacArrayList = new ArrayList<Zodiac>();
        zodiacArrayList.add(new Zodiac(R.drawable.aquarius,"Aquarius",getString(R.string.aquarius_general_info),"Jan 20 - Feb 18"));
        zodiacArrayList.add(new Zodiac(R.drawable.pisces,"Pisces",getString(R.string.pisces_general_info),"Feb 19 - Mar 20"));
        zodiacArrayList.add(new Zodiac(R.drawable.aries,"Aries",getString(R.string.aries_general_info),"Mar 21 - Apr 19"));
        zodiacArrayList.add(new Zodiac(R.drawable.taurus,"Taurus",getString(R.string.taurus_general_info),"Apr 20 - May 20"));
        zodiacArrayList.add(new Zodiac(R.drawable.gemini,"Gemini",getString(R.string.gemini_general_info),"May 21 - Jun 20"));
        zodiacArrayList.add(new Zodiac(R.drawable.cancer,"Cancer",getString(R.string.cancer_general_info),"Jun 21 - Jul 22"));
        zodiacArrayList.add(new Zodiac(R.drawable.leo,"Leo",getString(R.string.leo_general_info),"Jul 23 - Aug 22"));
        zodiacArrayList.add(new Zodiac(R.drawable.virgo,"Virgo",getString(R.string.virgo_general_info),"Aug 23 - Sep 22"));
        zodiacArrayList.add(new Zodiac(R.drawable.libra,"Libra",getString(R.string.libra_general_info),"Sep 23 - Oct 22"));
        zodiacArrayList.add(new Zodiac(R.drawable.scorpio,"Scorpio",getString(R.string.scorpio_general_info),"Oct 23 - Nov 21"));
        zodiacArrayList.add(new Zodiac(R.drawable.sagittarius,"Sagittarius",getString(R.string.sagittarius_general_info),"Nov 22 - Dec 21"));
        zodiacArrayList.add(new Zodiac(R.drawable.capricorn,"Capricorn",getString(R.string.capricorn_general_info),"Dec 22 - Jan 19"));

        final ArrayAdapter<Zodiac> theArrayAdapter = new ZodiacAdapter(this,zodiacArrayList);

        listView.setAdapter(theArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Zodiac selectedZodiac = (Zodiac)listView.getItemAtPosition(position);
                Toast.makeText(getBaseContext(),selectedZodiac.name, Toast.LENGTH_SHORT).show();
                loadTheZodiacPage(selectedZodiac);
            }
        });
    }

    public void loadTheZodiacPage(Zodiac clickedZodiac){

        Intent intent = new Intent(this, ZodiacActivity.class);
        intent.putExtra("TheZodiac", clickedZodiac);
        startActivity(intent);
    }
}
