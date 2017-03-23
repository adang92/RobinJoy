package com.example.ann.robinjoy;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Requests extends Activity implements OnItemSelectedListener{

    Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
    Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1 = String.valueOf(spinner1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();

        if (sp1.contentEquals("Hygiene")) {
            adapter = ArrayAdapter.createFromResource(this, R.array.Hygiene, android.R.layout.simple_spinner_dropdown_item);
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            spinner2.setAdapter(adapter);
        }

        if (sp1.contentEquals("Food")) {
            adapter = ArrayAdapter.createFromResource(this, R.array.Food, android.R.layout.simple_spinner_dropdown_item);
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            spinner2.setAdapter(adapter);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }



}
