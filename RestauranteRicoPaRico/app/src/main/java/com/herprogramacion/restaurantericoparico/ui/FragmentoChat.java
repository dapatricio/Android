package com.herprogramacion.restaurantericoparico.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.herprogramacion.restaurantericoparico.R;


public class FragmentoChat extends android.support.v4.app.Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_chat, container, false);
        return rootView;
    }
}