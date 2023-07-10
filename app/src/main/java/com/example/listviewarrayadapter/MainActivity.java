package com.example.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.listviewarrayadapter.ListView.HardList.HardList;
import com.example.listviewarrayadapter.RecyclerViewFolder.MainRecyclerView;

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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.MainListView){
            startActivity(new Intent(this, MainListViewActivity.class));
            return true;
        } else if(id == R.id.HardList) {
            startActivity(new Intent(this, HardList.class));
            return true;
        }   else if(id == R.id.Spinner) {
            startActivity(new Intent(this, SpinnerActivity.class));
            return true;
        }  else if(id == R.id.AutoComplete) {
            startActivity(new Intent(this, AutoComplete.class));
            return true;
        }else if(id == R.id.GridView) {
            startActivity(new Intent(this, GridViewActivity.class));
            return true;
        }
        else if(id == R.id.RecyclerView) {
            startActivity(new Intent(this, MainRecyclerView.class));
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}