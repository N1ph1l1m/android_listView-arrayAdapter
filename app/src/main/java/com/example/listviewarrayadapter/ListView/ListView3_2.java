package com.example.listviewarrayadapter.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.listviewarrayadapter.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListView3_2 extends AppCompatActivity {


    ArrayList<String> users = new ArrayList<String>();
    ArrayList<String> selectedUsers = new ArrayList<String >();
    ArrayAdapter<String> adapter;
    EditText userName;
    ListView listView3_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3_2);
        listView3_2 = findViewById(R.id.ListView3_2);
        // добавляем начальные элементы
        String[]Names = getResources().getStringArray(R.array.Names);

        try{
            Collections.addAll( users, Names);
        }catch (Exception e){
            Log.d("3_3", String.valueOf(e));
        }
        // создаем адаптер
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,users);
        // устанавливаем для списка адаптер
        listView3_2.setAdapter(adapter);

        // обработка установки и снятия отметки в списке
        listView3_2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    // получаем нажатый элемент
                    String user = adapter.getItem(position);
                    if(listView3_2.isItemChecked(position))
                        selectedUsers.add(user);
                    else
                        selectedUsers.remove(user);
                }
        });
    }
    public void add(View view) {
       userName = findViewById(R.id.userName);
       String user = userName.getText().toString();
       if(!user.isEmpty()){
           adapter.add(user);
           userName.setText("");
           adapter.notifyDataSetChanged();
       }
    }

    public void remove(View view) {
        // получаем и удаляем выделенные элементы
        for (int i = 0; i < selectedUsers.size(); i++){
        adapter.remove(selectedUsers.get(i));
        }
        listView3_2.clearChoices();
        // снимаем все ранее установленные отметки
        selectedUsers.clear();
        // очищаем массив выбраных объектов
        adapter.notifyDataSetChanged();
    }

    /*
    * С добавлением все относительно просто: получаем введенную строку и добавляем в список с помощью метода adapter.add().
    * Чтобы обновить ListView после добавления вызывается метод adapter.notifyDataSetChanged().
    * А для удаления создается дополнительный список selectedUsers, который будет содержать выделенные элементы.
    * Для получения выделенных элементов и добавления их в список используется слушатель AdapterView.OnItemClickListener, метод onItemClick() которого вызывается при установке или снятия отметки с элемента, то есть при любом нажатии на элемент.
    * По нажатию на кнопку удаления пробегаемся по списку выделенных элементов и вызываем для каждого из них метод adapter.remove().
    *     * */


}