package com.example.listviewarrayadapter.RecyclerViewFolder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listviewarrayadapter.R;

import java.util.ArrayList;

public class MainRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // начальная инициализация списка
        setInitialData();
        recyclerView = findViewById(R.id.resList);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setAdapter(StateAdapter adapter) {
    }

    private void setInitialData() {
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
        states.add(new State("Mike","Bravis",R.drawable.person_1));
    }


}