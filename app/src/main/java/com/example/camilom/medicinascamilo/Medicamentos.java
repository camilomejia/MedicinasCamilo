package com.example.camilom.medicinascamilo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Camilo M on 16/01/2017.
 */

//Esta clase es para poblar 
public class Medicamentos {

    private float precio;
    private String nombre;
    private int idDrawable;

    public Medicamentos(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Medicamentos> MEDICAMENTOS_POPULARES = new ArrayList<Medicamentos>();
    public static final List<Medicamentos> MEDICAMENTOS = new ArrayList<>();
    public static final List<Medicamentos> PASTA = new ArrayList<>();
    public static final List<Medicamentos> LIQUIDO = new ArrayList<>();

    static {
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
        MEDICAMENTOS_POPULARES.add(new Medicamentos(1000, "Condones", R.drawable.camarones));
    }

    public float getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getIdDrawable(){
        return  idDrawable;
    }

}
