package be.vdab.git.spaarrekening;

public class Zichtrekening extends Rekening {

    private int maxKrediet;
    private static final double INTEREST_ZICHTREKENING = 0.25;

    public Zichtrekening(String rekeningNummer, int bedrag) {
        this(rekeningNummer, 0.0, bedrag);
    }

    public Zichtrekening(String rekeningNummer, double saldo, int bedrag) {
        super(rekeningNummer, saldo);
        setMaxKrediet(bedrag);
    }

    @Override
    public double berekenInterest() {
        if (getSaldo() > 0) {
            return getSaldo() * INTEREST_ZICHTREKENING / 100;
        }
        return 0.0;
    }

    public int getMaxKrediet() {
        return maxKrediet;
    }

    public final void setMaxKrediet(int maxKrediet) {
        if (maxKrediet > 0) {
            this.maxKrediet = maxKrediet;
        }
    }

    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo() - bedrag + maxKrediet;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + maxKrediet;
    }
}
