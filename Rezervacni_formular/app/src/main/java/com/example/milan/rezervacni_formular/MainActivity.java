package com.example.milan.rezervacni_formular;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String [] nazvyPolozekNavDrawer = {"Rezervace","Služby","Pokoje","O hotelu","Kontakt"};
    private DrawerLayout drawerLayout;
    private ListView drawerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //navigation drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<String>(this,R.layout.drawer_list_item,nazvyPolozekNavDrawer));

        //action bar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.akce1:
                Toast.makeText(getBaseContext(),"Akce 1",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.akce2:
                Toast.makeText(getBaseContext(),"Akce 2",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.akce3:
                Toast.makeText(getBaseContext(),"Akce 3",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.akce4:
                Toast.makeText(getBaseContext(),"Akce 4",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.akce5:
                Toast.makeText(getBaseContext(),"Akce 5",Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public  void zobrazRezervace(View view){
        Button tlac = (Button) findViewById(R.id.tlacRezervace);
        Intent intent = new Intent(this,RezervaceActivity.class);
        startActivity(intent);
    }

    public  void zobrazSluzby(View view){
        Button tlac = (Button) findViewById(R.id.tlacSluzby);
        Intent intent = new Intent(this,SluzbyActivity.class);
        startActivity(intent);
    }

    public  void zobrazPokoje(View view){
        Button tlac = (Button) findViewById(R.id.tlacPokoje);
        Intent intent = new Intent(this,PokojeActivity.class);
        startActivity(intent);
    }

    public  void zobrazOHotelu(View view){
        Button tlac = (Button) findViewById(R.id.tlacOHotelu);
        Intent intent = new Intent(this,OHoteluActivity.class);
        startActivity(intent);
    }

    public  void zobrazKontakty(View view){
        Button tlac = (Button) findViewById(R.id.tlacKontakty);
        Intent intent = new Intent(this,KontaktyActivity.class);
        startActivity(intent);
    }

}
