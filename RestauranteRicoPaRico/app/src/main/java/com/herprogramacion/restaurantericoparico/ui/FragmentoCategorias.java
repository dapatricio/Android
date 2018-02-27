package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.youtube.player.internal.v;
import com.herprogramacion.restaurantericoparico.R;


public class FragmentoCategorias extends android.support.v4.app.Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_categorias, container, false);


        Button btnBuscar = (Button) rootView.findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnBuscar:
                        Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadLista");
                        startActivity(info);
                        break;
                }
            }
        });
        return rootView;
    }
}