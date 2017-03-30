package com.artiaga;

public class Main {

    public static void main(String[] args) {


        /*Electrodomesticos test1 = new Electrodomesticos();


        test1.setPrecioBase(100);
        test1.setConsumoElectrico("A");

        System.out.println(test1.precioBruto());

        test1.setPeso(100);
        System.out.println(test1.precioTransporte());
        System.out.println(test1.pvp());

	// write your code here

        Lavadoras test2 = new Lavadoras();

        System.out.println();
*/

        Electrodomesticos test1 = new Electrodomesticos("marca","modelo", 100, "A", -1, 200, 100);
        System.out.println(test1);

        Lavadoras test2 = new Lavadoras("marca","modelo", 100, "A", -1, 200, 100, "sada", 100, true);

        Frigorificos test3 = new Frigorificos("marca","modelo", 100, "A", -1, 200, 100, 100, 100, "asda");
    }
}
