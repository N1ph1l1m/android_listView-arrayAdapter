package com.example.listviewarrayadapter.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewarrayadapter.MainActivity;
import com.example.listviewarrayadapter.R;

public class ListView2 extends AppCompatActivity {

    ListView  listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
//
//        listView2 = findViewById(R.id.listView2);
//
//        // получаем ресурс
//        String[]Names = getResources().getStringArray(R.array.Names);
//
//        // создаем адаптер
//        ArrayAdapter <String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,Names);
//
//        // устанавливаем для списка адаптер
//        listView2.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}