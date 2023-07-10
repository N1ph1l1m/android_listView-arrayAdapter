package com.example.listviewarrayadapter.ListView.MyList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewarrayadapter.R;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {
    private LayoutInflater inflater;
    private int layout;
    private List<State>states;

    public StateAdapter(Context context, int resource, List<State> states){
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater  = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView , ViewGroup parent){

        ViewHolder viewHolder;
        if(convertView == null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        State state = states.get(position);

        viewHolder.imageView.setImageResource(state.getIconResource());
        viewHolder.nameView.setText(state.getName());
        viewHolder.surmameView.setText(state.getSurname());

        return convertView;

    }
    public class ViewHolder {
        final ImageView imageView;
        final TextView nameView, surmameView;
        ViewHolder(View view){
            imageView = view.findViewById(R.id.icon);
            nameView = view.findViewById(R.id.name);
            surmameView = view.findViewById(R.id.surname);
        }
    }

/*
*Все взаимодействие со списком здесь будет идти через класс StateAdapter. В конструкторе StateAdapter нам надо передать в конструктор базового класса три параметра:

        контекст, в котором используется класс. В его роли кк правило выступает класс Activity

        ресурс разметки интерфейса, который будет использоваться для создания одного элемента в ListView

    набор объектов, которые будут выводиться в ListView

В конструкторе StateAdapter мы получаем ресурс разметки и набор объекто и сохраняем их в отдельные переменные. Кроме того, для создания объекта View по полученному ресурсу разметки потребуется объект LayoutInflater, который также сохраняется в переменную.

В методе getView() устанавливается отображение элемента списка. Данный метод принимает три параметра:

position: передает позицию элемента внутри адаптера, для которого создается представление

convertView: старое представление элемента, которое при наличии используется ListView в целях оптимизации

parent: родительский компонент для представления элемента
*
* */

}
