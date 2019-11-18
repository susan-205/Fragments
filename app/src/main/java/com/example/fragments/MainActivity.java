package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements OnSelectitemListener{
    ArrayList<String> datos;
    boolean pulsado = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = new ArrayList<>();
        datos.add("Pepe");
        datos.add("Susan");
        datos.add("Jose");

        FragmentUno f1= new FragmentUno(datos);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.contenedor,f1);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void OnSelectItem(String dato) {
        FragmentDos f2 = new FragmentDos();

        Bundle bundle = new Bundle();
        bundle.putString("DATO",dato);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        f2.setArguments(bundle);
        ft.replace(R.id.contenedor,f2);
        ft.commit();
    }
}
