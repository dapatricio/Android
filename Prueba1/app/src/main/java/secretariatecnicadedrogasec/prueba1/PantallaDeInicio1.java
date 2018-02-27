package secretariatecnicadedrogasec.prueba1;

/**
 * Created by dapat on 08/09/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PantallaDeInicio1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalladeinicio1);

        //Vamos a declarar un nuevo thread
        Thread timer = new Thread(){
            //El nuevo Thread exige el metodo run
            public void run(){
                try{
                    sleep(1500);
                }catch(InterruptedException e){
                    //Si no puedo ejecutar el sleep muestro el error
                    e.printStackTrace();
                }finally{
                    //Llamo a la nueva actividad
                    //startActivity recibe por parametro un objeto del tipo Intent
                    //El Intent recibibe por parametro el NAME de la actividad que vamos a invocar
                    //Es el mismo que colocamos en el manifiesto
                    Intent pantalla2 = new Intent("secretariatecnicadedrogasec.prueba1.pantalla2");
                    startActivity(pantalla2);
                }
            }
        };
        //ejecuto el thread
        timer.start();
    }

}
