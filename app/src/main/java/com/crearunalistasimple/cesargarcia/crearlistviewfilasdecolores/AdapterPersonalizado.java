package com.crearunalistasimple.cesargarcia.crearlistviewfilasdecolores;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Floro on 18/10/2015.
 */
public class AdapterPersonalizado  extends ArrayAdapter{

    private final Context context;
    private final String[] values;
    private final String[] color;

    public AdapterPersonalizado(Context context, String[] values,String[] color) {
        super(context, R.layout.lista_fila, values);
        this.context = context;
        this.values = values;
        this.color = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.lista_fila, parent, false);
        TextView tv = (TextView) rowView.findViewById(R.id.label);
        String item_value = values[position];
        String item_color = color[position];

        rowView.setBackgroundColor(Color.parseColor(item_color));
        tv.setText(item_value);
        return rowView;
    }
}
