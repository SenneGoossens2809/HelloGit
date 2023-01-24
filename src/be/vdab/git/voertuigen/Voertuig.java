package be.vdab.git.voertuigen;

public abstract class Voertuig {

    private String polishouder = "onbepaald";
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat = "onbepaald";

    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setPolishouder(polishouder);
        setNummerplaat(nummerplaat);
    }

    public abstract double getKyotoScore();

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty()) {
            this.polishouder = polishouder;
        }
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        if (kostprijs > 0) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
    }

    @Override
    public String toString() {
        return polishouder + ", " + nummerplaat + ", " + kostprijs + ", " + pk + ", " + gemVerbruik;
    }

    public String toon() {
        return "Polishouder: " + polishouder + "\n" + "Nummerplaat: " + nummerplaat + "\n" + "Kostprijs:" + kostprijs + "\n"
        + "PK: " + pk + "\n" + "Gemiddelde Verbruik:" + gemVerbruik;
    }
}
