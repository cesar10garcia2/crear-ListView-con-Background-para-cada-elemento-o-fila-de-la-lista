package com.crearunalistasimple.cesargarcia.crearlistviewfilasdecolores;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    String[] elemento = new String[] { "Elemento 0", "Elemento 1", "Elemento 2", "Elemento 3",
            "Elemento 4", "Elemento 5", "Elemento 6", "Elemento 7" };

    String[] color= { "#FFEBEE", "#CFD8DC", "#E1BEE7", "#C8E6C9",
            "#C5CAE9", "#FFF59D", "#B3E5FC", "#FFAB91" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        AdapterPersonalizado cv = new AdapterPersonalizado(this, elemento,color);
        setListAdapter(cv);
    }

}
