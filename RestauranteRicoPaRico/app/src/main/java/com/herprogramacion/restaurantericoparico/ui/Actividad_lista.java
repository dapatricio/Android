package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.herprogramacion.restaurantericoparico.R;


public class Actividad_lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_lista);


        TableRow tabla1 = (TableRow) findViewById(R.id.tabla1);
        TableRow tabla2 = (TableRow) findViewById(R.id.tabla2);
        TableRow tabla3 = (TableRow) findViewById(R.id.tabla3);

        tabla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView cord1 = (TextView)findViewById(R.id.cord1);
                String[] latlong =  (cord1.getText().toString()).split(",");
                String lat = latlong[0];
                String lng = latlong[1];
                double lat1 = Double.parseDouble(lat);
                double lng1 = Double.parseDouble(lng);
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.MapaGoogle");
                    Bundle b = new Bundle();
                    b.putDouble("lat", lat1);
                    b.putDouble("lng", lng1);
                    info.putExtras(b);
                startActivity(info);
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                lat1+","+lng1, Toast.LENGTH_SHORT);

                toast1.show();
            }
        });
        tabla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView cord1 = (TextView)findViewById(R.id.cord2);
                String[] latlong =  (cord1.getText().toString()).split(",");
                String lat = latlong[0];
                String lng = latlong[1];
                double lat1 = Double.parseDouble(lat);
                double lng1 = Double.parseDouble(lng);
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.MapaGoogle");
                Bundle b = new Bundle();
                b.putDouble("lat", lat1);
                b.putDouble("lng", lng1);
                info.putExtras(b);
                startActivity(info);

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                lat1+","+lng1, Toast.LENGTH_SHORT);

                toast1.show();
            }
        });
        tabla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView cord1 = (TextView)findViewById(R.id.cord3);
                String[] latlong =  (cord1.getText().toString()).split(",");
                String lat = latlong[0];
                String lng = latlong[1];
                double lat1 = Double.parseDouble(lat);
                double lng1 = Double.parseDouble(lng);
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.MapaGoogle");
                Bundle b = new Bundle();
                b.putDouble("lat", lat1);
                b.putDouble("lng", lng1);
                info.putExtras(b);
                startActivity(info);

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                lat1+","+lng1, Toast.LENGTH_SHORT);

                toast1.show();
            }
        });
        ImageButton btn = (ImageButton)findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ImageButton btn1 = (ImageButton)findViewById(R.id.btnHome);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info1 = new Intent("com.herprogramacion.restaurantericoparico.ActividadPrincipal");
                startActivity(info1);
            }
        });
    }
}
