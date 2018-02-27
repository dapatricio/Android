package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private String precio;
    private String nombre;
    private int idDrawable;

    public Comida(String precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen1));
        COMIDAS_POPULARES.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen2));
        COMIDAS_POPULARES.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen3));


        PLATILLOS.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen1));
        PLATILLOS.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen2));
        PLATILLOS.add(new Comida("Texto Principal", "Texto secundario", R.drawable.imagen3));


    }

    public String getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
