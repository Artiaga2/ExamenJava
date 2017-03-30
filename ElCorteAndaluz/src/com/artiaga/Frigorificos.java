package com.artiaga;

import java.lang.reflect.Array;

/**
 * Created by artiaga on 30/3/17.
 */
public class Frigorificos extends Electrodomesticos {

private int capacidadTotal;
private int capacidadCongelador;
private String lista;

//Constructores

    public Frigorificos(String marca, String modelo, double precioBase, String consumoElectrico, int altura, int anchura, int peso, int capacidadTotal, int capacidadCongelador, String lista) {
        super(marca, modelo, precioBase, consumoElectrico, altura, anchura, peso);
        this.capacidadTotal = capacidadTotal;
        this.capacidadCongelador = capacidadCongelador;
        this.lista = lista;
    }

    public Frigorificos() {
    }


    //Accesores


    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        if (this. capacidadTotal < 0){
            System.out.println("anchura mal");
        }else {
            this.capacidadTotal = capacidadTotal / 100;
        }
    }

    public int getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(int capacidadCongelador) {
        if (this. capacidadCongelador < 0){
            System.out.println("anchura mal");
        }else {
            this.capacidadCongelador = capacidadCongelador / 100;
        }
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    //Metodos

    public double ingesoTotalFrigorificos(double...args){

        double precio = 0;

        for (int i = 0; i < args.length ; i++) {
            precio += args[i];
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Frigorificos{" +
                "capacidadTotal=" + capacidadTotal +
                ", capacidadCongelador=" + capacidadCongelador +
                ", lista='" + lista + '\'' +
                '}';
    }
}
