package be.vdab.git.winkel;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Mandje {

    private Map<Product, BigDecimal> mandje;
    private final Catalogus catalogus;

    public Mandje(Catalogus catalogus) {
        this.catalogus = catalogus;
        mandje = new HashMap<>();
    }

    public void add(Product product, BigDecimal aantal) {
        if (mandje.containsKey(product)) {
            mandje.put(product, mandje.get(product).add(aantal));
            return;
        }
        mandje.put(product, aantal);
    }

    public void remove(Product product) {
        mandje.remove(product);
    }

    public void clear() {
        mandje.clear();
    }

    public BigDecimal getTotalePrijs() {
        BigDecimal totaal = BigDecimal.ZERO;
        for (var product : mandje.entrySet()) {
            BigDecimal prijs = product.getKey().getPrijs();
            BigDecimal aantal = product.getValue();
            totaal = totaal.add(prijs.multiply(aantal));
        }
        return totaal;
    }

    @Override
    public String toString() {
        String message = "";
        for (var product : mandje.entrySet()) {
            message += product.toString();
        }
        return message;
    }
}


