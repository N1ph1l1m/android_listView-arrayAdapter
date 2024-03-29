package com.example.listviewarrayadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.listviewarrayadapter.ListView.HardList.HardList;
import com.example.listviewarrayadapter.ListView.ListView1;
import com.example.listviewarrayadapter.ListView.ListView2;
import com.example.listviewarrayadapter.ListView.ListView3;
import com.example.listviewarrayadapter.ListView.MyList.MyListView;
import com.example.listviewarrayadapter.R;

public class MainListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_list,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
        }else if(id == R.id.MyListView) {
            startActivity(new Intent(this, MyListView.class));
            return true;
        }
        else if(id == R.id.HardList) {
            startActivity(new Intent(this, HardList.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}