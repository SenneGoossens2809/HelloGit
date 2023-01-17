package be.vdab.git.voertuigen;

public class Vrachtwagen extends Voertuig {

    private float maxLading;

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        this.maxLading = maxLading;
    }
}
