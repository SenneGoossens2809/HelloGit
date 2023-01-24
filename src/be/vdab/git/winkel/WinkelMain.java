package be.vdab.git.winkel;

import java.math.BigDecimal;

public class WinkelMain {

    public static void main(String[] args) {

        Catalogus catalogus = new Catalogus(new Product("Appel", BigDecimal.valueOf(2.32)),
                new Product("Pizza", BigDecimal.valueOf(5.43)),
                new Product("Boek", BigDecimal.valueOf(10.40)),
                new Product("Stoel", BigDecimal.valueOf(30.16)));
        Mandje mandje = new Mandje(catalogus);

        mandje.add(catalogus.getProduct("Appel"), BigDecimal.valueOf(3));
        mandje.add(catalogus.getProduct("Stoel"), BigDecimal.valueOf(3));

        mandje.remove(catalogus.getProduct("Stoel"));

        mandje.add(catalogus.getProduct("Stoel"), BigDecimal.valueOf(10));
        mandje.remove(catalogus.getProduct("Appel"));

        mandje.add(catalogus.getProduct("Stoel"), BigDecimal.valueOf(5));

        System.out.println("De totale prijs is: " + mandje.getTotalePrijs());

    }
}
