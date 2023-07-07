package com.example.listviewarrayadapter.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewarrayadapter.R;

public class ListView1 extends AppCompatActivity {

    ListView listView1;
    String[] contries = {"New York", "Chicago","Lost-Angeles", "Tenesy","California","Joyrdgia" , "Georgia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);

        listView1 = findViewById(R.id.ListView1);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,contries);

        listView1.setAdapter(adapter);

    }
}