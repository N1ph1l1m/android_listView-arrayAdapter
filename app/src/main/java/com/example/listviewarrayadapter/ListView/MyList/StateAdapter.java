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
        this.states =states;
        this.layout = resource;
        this.inflater  = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView , ViewGroup parent){

        View view = inflater.inflate(this.layout, parent, false);
        ImageView iconView = view.findViewById(R.id.icon);
        TextView nameView = view.findViewById(R.id.name);
        TextView capitalView = view.findViewById(R.id.surname);

        State state = states.get(position);

        iconView.setImageResource(state.getIconResource());
        nameView.setText(state.getName());
        capitalView.setText(state.getSurname());

        return view;

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
