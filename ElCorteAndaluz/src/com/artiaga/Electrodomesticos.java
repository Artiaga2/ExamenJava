package com.artiaga;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by artiaga on 30/3/17.
 */
public class Electrodomesticos {



    private String marca;
    private String modelo;
    private double precioBase;
    private String consumoElectrico;
    private int altura;
    private int anchura;
    private int peso;


    //Constructores

    public Electrodomesticos(String marca, String modelo, double precioBase, String consumoElectrico, int altura, int anchura, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoElectrico = consumoElectrico;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }

    public Electrodomesticos() {
    }


    //Accesores


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(String consumoElectrico) {

        this.consumoElectrico = consumoElectrico;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {

        if (this.altura < 0){
            System.out.println("Altura mal");
        }else {
            this.altura = altura / 100;
        }
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        if (this.anchura < 0) {
            System.out.println("anchura mal");
        } else {
            this.anchura = anchura / 100;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Metodos

    public double precioBruto (){


        double precio = this.getPrecioBase();

        if (consumoElectrico == "A"){

            precio = precio + 100;
        }

        else if (consumoElectrico == "B"){

            precio  = precio + 80;
        }

        else if (consumoElectrico == "C"){

            precio = precio + 60;
        }

        else if (consumoElectrico == "D"){

            precio = precio + 50;
        }

        else if (consumoElectrico == "E"){

            precio = precio + 30;
        }

        else if (consumoElectrico == "F"){

            precio =  precio + 10;
        }

        else{

            System.out.println("Introduzca una letra compatible por favor");

        }

        return precio;

    }

    //public int precioTransporte


    public double precioTransporte(){

        double precio = getPrecioBase();
        if (this.getPeso() >= 0 && this.getPeso() < 20){

            precio = precio + 10;
        }

        else if (this.getPeso() >= 20 && this.getPeso() < 50){

            precio = precio + 50;
        }

        else if (this.getPeso() >= 50 && this.getPeso() < 80){

            precio = precio + 80;
        }

        else if (this.getPeso() >= 80){

            precio = precio + 100;
        }

        else if (this.getPeso() < 0){

            System.out.println("Introduzca un peso válido por favor");;
        }


        return precio;
    }


    public double pvp() {

        double precio;

        precio = precioBruto() + precioTransporte();

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", consumoElectrico='" + consumoElectrico + '\'' +
                ", altura=" + altura + " metros" +
                ", anchura=" + anchura + " metros" +
                ", peso=" + peso + " Kilos" +
                ", Precio Bruto=" + precioBruto() +
                ", Precio Transporte=" + precioTransporte() +
                ", pvp=" + pvp() +
                '}';
    }
}
