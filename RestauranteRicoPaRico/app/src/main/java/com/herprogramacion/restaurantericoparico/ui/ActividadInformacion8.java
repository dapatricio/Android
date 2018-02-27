package com.herprogramacion.restaurantericoparico.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.herprogramacion.restaurantericoparico.R;

public class ActividadInformacion8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_informacion8);

        Button btn = (Button)findViewById(R.id.btnVolver);
        btn.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
