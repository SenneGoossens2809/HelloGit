package be.vdab.git.winkel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Catalogus {

    private Set<Product> producten;

    public Catalogus(Product... product) {
        producten = new HashSet<>();
        producten.addAll(List.of(product));
    }

    public Set<Product> getProducten() {
        return producten;
    }

    public Product getProduct(String omschrijving) {
        for (var product : producten) {
            if (product.getOmschrijving().equalsIgnoreCase(omschrijving)) {
                return product;
            }
        }
        return null;
    }
}
