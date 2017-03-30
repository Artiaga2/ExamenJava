package com.artiaga;

import java.lang.reflect.Array;

/**
 * Created by artiaga on 30/3/17.
 */
public class Lavadoras extends Electrodomesticos {

    private String tipoCarga;
    private double velocidadCentrifugado;
    private boolean secadoras;


    //Constructores

    public Lavadoras(String marca, String modelo, double precioBase, String consumoElectrico, int altura, int anchura, int peso, String tipoCarga, double velocidadCentrifugado, boolean secadoras) {
        super(marca, modelo, precioBase, consumoElectrico, altura, anchura, peso);
        this.tipoCarga = tipoCarga;
        this.velocidadCentrifugado = velocidadCentrifugado;
        this.secadoras = secadoras;
    }

    public Lavadoras() {
    }

    //Accesores


    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }

    public void setVelocidadCentrifugado(double velocidadCentrifugado) {
        if (this. velocidadCentrifugado < 0){
            System.out.println("anchura mal");
        }else {
            this.velocidadCentrifugado = velocidadCentrifugado / 60;
        }
    }

    public boolean isSecadoras() {
        return secadoras;
    }

    public void setSecadoras(boolean secadoras) {
        this.secadoras = secadoras;

    }

    //metodos

    public double ingesoTotalLavadoras(double...args){

        double precio = 0;

        for (int i = 0; i < args.length ; i++) {
            precio += args[i];
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Lavadoras{" +
                "tipoCarga='" + tipoCarga + '\'' +
                ", velocidadCentrifugado=" + velocidadCentrifugado +
                ", secadoras=" + secadoras +
                '}';
    }
}
