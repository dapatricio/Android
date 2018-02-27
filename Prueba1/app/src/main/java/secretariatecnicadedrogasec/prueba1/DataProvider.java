package secretariatecnicadedrogasec.prueba1;

import android.app.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dapat on 26/09/2016.
 */

public class DataProvider {

    public static HashMap<String, List<String>> getInfo(){

        HashMap<String, List<String>> MoviesDetails = new HashMap<String , List<String>>();
        List<String> Action_Movies = new ArrayList<String>();
        Action_Movies.add("asdfasdfasdf");
        Action_Movies.add("asdfasdfasdf");
        Action_Movies.add("asdfasdfasdf");
        Action_Movies.add("asdfasdfasdf");
        List<String> Romantic_Movies = new ArrayList<String>();
        Romantic_Movies.add("asdfasdfasdf");
        Romantic_Movies.add("asdfasdfasdf");
        Romantic_Movies.add("asdfasdfasdf");
        Romantic_Movies.add("asdfasdfasdf");
        List<String> Horror_Movies = new ArrayList<String>();
        Horror_Movies.add("asdfasdfasdf");
        Horror_Movies.add("asdfasdfasdf");
        Horror_Movies.add("asdfasdfasdf");
        Horror_Movies.add("asdfasdfasdf");
        List<String> Comedy_Movies = new ArrayList<String>();
        Comedy_Movies.add("asdfasdfasdf");
        Comedy_Movies.add("asdfasdfasdf");
        Comedy_Movies.add("asdfasdfasdf");
        Comedy_Movies.add("asdfasdfasdf");


        MoviesDetails.put("Informacion de Drogas", Horror_Movies); //se muestra primero
        MoviesDetails.put("Informacion de Alcohol", Romantic_Movies); //se muestra segundo
        MoviesDetails.put("Informacion de Daños a la Salud", Action_Movies); //se muestra cuarto
        MoviesDetails.put("Informacion de Daño a la comunidad", Comedy_Movies); //se muestra tercero


                return MoviesDetails;
    }
}
