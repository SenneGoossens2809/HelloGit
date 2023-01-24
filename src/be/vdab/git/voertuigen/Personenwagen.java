package be.vdab.git.voertuigen;

public class Personenwagen extends Voertuig {

    private int aantalDeuren;
    private int aantalPassagiers;

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }

    private void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
            return;
        }
        this.aantalDeuren = 4;
    }

    private void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
            return;
        }
        this.aantalPassagiers = 5;
    }

    @Override
    public String toString() {
        return this.getPolishouder() + ", " + this.getNummerplaat() + ", " + this.getKostprijs() +
                ", " + this.getPk() + ", " + this.getGemVerbruik() + ", " + aantalDeuren + ", " + aantalPassagiers;
    }

    @Override
    public String toon() {
        return "Polishouder: " + this.getPolishouder() + "\n" + "Nummerplaat: " + this.getNummerplaat() + "\n"
                + "Kostprijs: " + this.getKostprijs() + "\n" + "PK: " + this.getPk() + "\n" + "Gemiddelde Verbruik: "
                + this.getGemVerbruik() + "\n" + "Aantal Deuren: " + aantalDeuren + "\n" + "Aantal Passagiers: " + aantalPassagiers;
    }




}
