package be.vdab.git.winkel;

public class Product {

    private String omschrijving;
    private double prijs;

    public Product(String omschrijving, double prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }
}
