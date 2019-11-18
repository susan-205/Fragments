package com.example.fragments;



import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;



public class FragmentUno extends ListFragment {
    ArrayList<String> datos;
    OnSelectitemListener listener;


    public FragmentUno(ArrayList<String> datos){
        this.datos = datos;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,datos));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        listener.OnSelectItem(datos.get(position));

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener=(OnSelectitemListener)context;
    }
}
