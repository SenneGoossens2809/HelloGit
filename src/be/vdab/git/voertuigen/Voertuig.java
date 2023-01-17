package be.vdab.git.voertuigen;

public class Voertuig {

    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setGegevens(polishouder, nummerplaat, kostprijs, gemVerbruik, pk);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    private void setGegevens(String polishouder, String nummerplaat, float kostprijs, float gemVerbruik, int pk) {
        if (polishouder == null || nummerplaat == null) {
            System.out.println("Polishouder en nummerplaat kan niet null zijn!");
            return;
        }

        this.polishouder = polishouder;
        this.nummerplaat = nummerplaat;

        if (pk <= 0 || kostprijs <= 0 || gemVerbruik <= 0) {
            System.out.println("Nummerieke gevens moete groter zijn dan 0!");
            return;
        }

        this.gemVerbruik = gemVerbruik;
        this.kostprijs = kostprijs;
        this.pk = pk;
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
