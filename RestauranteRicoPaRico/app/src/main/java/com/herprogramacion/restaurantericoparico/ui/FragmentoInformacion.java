package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FragmentoInformacion extends android.support.v4.app.Fragment {
    View rootView;
    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView Exp_list;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_informacion, container, false);
        /*Exp_list = (ExpandableListView) rootView.findViewById(R.id.exp_list);
        Movies_category = DataProvider.getInfo();
        Movies_list = new ArrayList<String>(Movies_category.keySet());
        adapter = new MoviesAdapter(this, Movies_category, Movies_list);
        Exp_list.setAdapter(adapter);*/

        ImageButton btn = (ImageButton)rootView.findViewById(R.id.btnImg1);
        ImageButton btn2 = (ImageButton)rootView.findViewById(R.id.btnImg2);
        ImageButton btn3 = (ImageButton)rootView.findViewById(R.id.btnImg3);
        ImageButton btn4 = (ImageButton)rootView.findViewById(R.id.btnImg4);
        ImageButton btn5 = (ImageButton)rootView.findViewById(R.id.btnImg5);
        ImageButton btn6 = (ImageButton)rootView.findViewById(R.id.btnImg6);
        ImageButton btn7 = (ImageButton)rootView.findViewById(R.id.btnImg7);
        ImageButton btn8 = (ImageButton)rootView.findViewById(R.id.btnImg8);
        ImageButton btn9 = (ImageButton)rootView.findViewById(R.id.btnImg9);
        ImageButton btn10 = (ImageButton)rootView.findViewById(R.id.btnImg10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion1");
                startActivity(info);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion2");
                startActivity(info);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion3");
                startActivity(info);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion4");
                startActivity(info);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion5");
                startActivity(info);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion6");
                startActivity(info);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion7");
                startActivity(info);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion8");
                startActivity(info);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInformacion9");
                startActivity(info);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.ActividadInfo10");
                startActivity(info);
            }
        });
        return rootView;
    }
}
