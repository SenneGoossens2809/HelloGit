package be.vdab.git.winkel;

import java.util.HashSet;
import java.util.Set;

public class Catalogus {

    private Set<Product[]> producten;

    public Catalogus(Product... product) {
        producten = new HashSet<>();
        producten.add(product);
    }

    public Set<Product[]> getProducten() {
        return producten;
    }
}
