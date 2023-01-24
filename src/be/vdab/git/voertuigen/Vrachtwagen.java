package be.vdab.git.voertuigen;

public class Vrachtwagen extends Voertuig {

    private float maxLading = 10000;

    public Vrachtwagen() {

    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / maxLading;
    }

    private void setMaxLading(float maxLading) {
        if (maxLading > 0) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return this.getPolishouder() + ", " + this.getNummerplaat() + ", " + this.getKostprijs() +
                ", " + this.getPk() + ", " + this.getGemVerbruik() + ", " + maxLading;
    }

    @Override
    public String toon() {
        return "Polishouder: " + this.getPolishouder() + "\n" + "Nummerplaat: " + this.getNummerplaat() + "\n"
                + "Kostprijs:" + this.getKostprijs() + "\n" + "PK: " + this.getPk() + "\n" + "Gemiddelde Verbruik:"
                + this.getGemVerbruik() + "\n" + "Maxium Lading: " + maxLading;
    }
}
