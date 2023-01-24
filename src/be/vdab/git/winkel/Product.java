package be.vdab.git.winkel;

import java.math.BigDecimal;

public class Product {

    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs +
                '}' + "\n";
    }
}
