package com.herprogramacion.restaurantericoparico.ui;

/**
 * Created by dapat on 08/09/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.herprogramacion.restaurantericoparico.R;

public class PantallaDeInicio2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalladeinicio2);

        //Vamos a declarar un nuevo thread
        Thread timer = new Thread(){
            //El nuevo Thread exige el metodo run
            public void run(){
                try{
                    sleep(500);
                }catch(InterruptedException e){
                    //Si no puedo ejecutar el sleep muestro el error
                    e.printStackTrace();
                }finally{
                    //Llamo a la nueva actividad
                    //startActivity recibe por parametro un objeto del tipo Intent
                    //El Intent recibibe por parametro el NAME de la actividad que vamos a invocar
                    //Es el mismo que colocamos en el manifiesto
                    Intent principal = new Intent("com.herprogramacion.restaurantericoparico.ActividadPrincipal");
                    startActivity(principal);
                }
            }
        };
        //ejecuto el thread
        timer.start();
    }

}
