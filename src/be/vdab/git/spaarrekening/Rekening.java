package be.vdab.git.spaarrekening;

public abstract class Rekening {

    private String rekeningNummer;
    private double saldo;

    public Rekening(String rekeningNummer) {
        setRekeningNummer(rekeningNummer);
    }

    public Rekening(String rekeningNummer, double saldo) {
        setRekeningNummer(rekeningNummer);
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public abstract double berekenInterest();

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public final void setRekeningNummer(String rekNr) {
        if (rekNr != null && !rekNr.isEmpty()) {
            rekeningNummer = rekNr;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void storten(double bedrag) {
        saldo =+ bedrag;
    }

    public void afhalen(double bedrag) {
        saldo -= bedrag;
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }

    public void overschrijven(Rekening rekening, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            rekening.storten(bedrag);
        }
    }

    @Override
    public String toString() {
        return rekeningNummer + ", " + saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rekening)) return false;

        var rekening = (be.vdab.git.spaarrekening.Rekening) o;
        return rekeningNummer.equals(rekening.getRekeningNummer());
    }
}
