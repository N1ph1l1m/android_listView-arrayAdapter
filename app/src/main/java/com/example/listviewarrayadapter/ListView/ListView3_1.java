package com.example.listviewarrayadapter.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listviewarrayadapter.R;

import java.util.List;

public class ListView3_1 extends AppCompatActivity {
    TextView textView3;
    ListView  listView3_1;

    String[] contries = {"New York", "Chicago","Lost-Angeles", "Tenesy","California","Joyrdgia" , "Georgia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3_1);
        textView3 = findViewById(R.id.textView3);
        listView3_1 = findViewById(R.id.listView3_1);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,contries);
        listView3_1.setAdapter(adapter);

        listView3_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                SparseBooleanArray selected = listView3_1.getCheckedItemPositions();
                String selectedItem="";
                for(int i = 0; i< contries.length; i++){
                    if(selected.get(i)){
                        selectedItem += contries[i] + ",";
                    }
                }
                try{
                    textView3.setTextColor(Color.parseColor("#5E35B1"));
                }catch (Exception e){
                    Log.d("Mess", String.valueOf(e));
                }

                textView3.setText("Выбрано:" + selectedItem);

            }
        });


    }
}