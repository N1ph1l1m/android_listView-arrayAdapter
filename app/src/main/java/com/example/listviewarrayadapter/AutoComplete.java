package com.example.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoComplete extends AppCompatActivity {

    String[] cities = {"Moscow","St.Peterburg","Tomsk","Vologda"};
    String [] colors ={"blue","gray","ping","green","yello","brown","red","purple","white_green","white_blue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocomplete);
        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.multuAutoComplete);

        // Создаем адаптер для автозаполнения элемента AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,cities);
        autoCompleteTextView.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,colors);
        multiAutoCompleteTextView.setAdapter(adapter1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }
}