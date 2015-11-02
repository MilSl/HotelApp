package com.example.milan.rezervacni_formular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RezervaceActivity extends AppCompatActivity {

    Button cancelButton;
    Button sendButton;
    EditText name;
    EditText address;
    EditText phone;
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezervace);

        cancelButton = (Button) findViewById(R.id.cancelButton);
        sendButton = (Button) findViewById(R.id.sendButton);
        name = (EditText) findViewById(R.id.nameField);
        address = (EditText) findViewById(R.id.addressField);
        phone = (EditText) findViewById(R.id.phoneField);
        mail = (EditText) findViewById(R.id.mailField);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Integer rozsahSpineru [] = new Integer[30];

        for(int i=1;i<=30;i++){
            rozsahSpineru[i-1] = i;
        }

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                address.setText("");
                phone.setText("");
                mail.setText("");

                Toast.makeText(getBaseContext(), "Pole vymazána", Toast.LENGTH_LONG).show();
            }
        });

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item,rozsahSpineru);
                spinner.setAdapter(adapter);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Jméno je povinné pole", Toast.LENGTH_LONG).show();

                }

                if(!isPhoneValid(v)){
                    Toast.makeText(getBaseContext(), "telefon špatně", Toast.LENGTH_LONG).show();
                }

                if (!isMailValid(v)){
                    Toast.makeText(getBaseContext(), "mail špatně", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    public Boolean isMailValid(View view){
        Pattern pat = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
        Matcher matcher = pat.matcher(mail.getText());
        return matcher.find();
    }

    public Boolean isPhoneValid(View view){
        Pattern pat = Pattern.compile("[0-9]{5} ?[0-9]{3} ?[0-9]{3} ?[0-9]{3}");
        Matcher matcher = pat.matcher(mail.getText());
        return matcher.find();


    }
}
