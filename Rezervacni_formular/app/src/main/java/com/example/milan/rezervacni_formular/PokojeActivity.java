package com.example.milan.rezervacni_formular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PokojeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokoje);
    }

    public  void zobrazObycenjnePokoje(View view){
        Button tlac = (Button) findViewById(R.id.tlacObycejnePokoje);
        Intent intent = new Intent(this,ObycejnePokojeActivity.class);
        startActivity(intent);
    }

    public  void zobrazLuxusniPokoje(View view){
        Button tlac = (Button) findViewById(R.id.tlacLuxusniPokoje);
        Intent intent = new Intent(this,LuxusniPokojeActivity.class);
        startActivity(intent);
    }
}
