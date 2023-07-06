package com.example.listviewarrayadapter.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listviewarrayadapter.MainActivity;
import com.example.listviewarrayadapter.R;

public class ListView3 extends AppCompatActivity {

    String[] contries = {"New York", "Chicago","Lost-Angeles", "Tenesy","California","Joyrdgia" , "Georgia"};
    ListView listView3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3);
        listView3= findViewById(R.id.listView3);
        textView = findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,contries);
        listView3.setAdapter(adapter);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // по позиции получаем выбранный элемент
                String selectedItem = contries[position];
                textView.setText(selectedItem);
            }
        });







    }


    @Override
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}