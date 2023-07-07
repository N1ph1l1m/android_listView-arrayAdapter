package com.example.listviewarrayadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewarrayadapter.ListView.ListView1;
import com.example.listviewarrayadapter.ListView.ListView2;
import com.example.listviewarrayadapter.ListView.ListView3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.ListView1){
            startActivity(new Intent(this, ListView1.class));
            return true;
        }else if(id == R.id.ListView2){
            startActivity(new Intent(this, ListView2.class));
            return true;
        }else if(id == R.id.ListView3) {
            startActivity(new Intent(this, ListView3.class));
            return true;
        }
        return super.onOptionsItemSelected(item);


    }
}