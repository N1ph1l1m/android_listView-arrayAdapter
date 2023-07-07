package com.example.listviewarrayadapter.ListView.MyList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewarrayadapter.R;

import java.util.ArrayList;

public class MyListView extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    ListView nameList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view);

        setInitialData();

        nameList = findViewById(R.id.myList);

        StateAdapter  stateAdapter= new StateAdapter(this, R.layout.mylist_item,states);

        nameList.setAdapter(stateAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                State selectedState = (State)adapterView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Был выбран пункт" + selectedState.getName(),Toast.LENGTH_SHORT).show();
            }
        };
            nameList.setOnItemClickListener(itemClickListener);

    }

    private void setInitialData() {
        states.add(new State ("Ivan", "Brascow", R.drawable.person_1));
        states.add(new State ("Masha", "Ponomorewa", R.drawable.person_2));
        states.add(new State ("Maksim", "Ptyshkin", R.drawable.person_4));
        states.add(new State ("Boris", "Kemberbekov", R.drawable.person_1));
    }
}