package be.vdab.git.winkel;

import java.util.Map;

public class Mandje {

    private Map<Product, Integer> mandje;
    private Catalogus catalogus;

    public Mandje() {
        catalogus = new Catalogus(
                new Product("Appel", 2.0),
                new Product("Boek", 5.0),
                new Product("Pizza", 6.25),
                new Product("Energy Drink", 2.50));
    }

    public void add(Product product, int aantal) {
        mandje.putIfAbsent(product, aantal);
        mandje.put(product, mandje.get(product) + aantal);
    }

    public void remove(Product product) {
        mandje.containsKey(product) ? mandje.remove(product) : System.out.println("Product zit niet in mandje!");
    }
}


