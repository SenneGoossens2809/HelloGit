package be.vdab.git.spaarrekening;

public class Spaarrekening extends Rekening {

    private static double interest;

    public Spaarrekening(String reknr, double interest) {
        this(reknr, interest, 0.0);
    }

    public Spaarrekening(String reknr, double interest, double saldo) {
        super(reknr, saldo);
        setInterest(interest);
    }

    @Override
    public double berekenInterest() {
        return getSaldo() * interest / 100;
    }

    private final void setInterest(double interest) {
        if (interest > 0.0) {
            Spaarrekening.interest = interest;
        }
    }

    public static double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + interest;
    }
}
