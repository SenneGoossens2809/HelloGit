package be.vdab.git.tienkamp;

public class Tienkamper implements Comparable<Tienkamper> {

    private String naam = "Onbekend";
    private int punten;

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null && !naam.isEmpty()) {
            this.naam = naam;
        }
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        if (punten > 0) {
            this.punten = punten;
        }
    }

    @Override
    public String toString() {
        return naam + ": " + punten + " Punten";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tienkamper tienkamper)) {
            return false;
        }
        return naam.equals(tienkamper.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public int compareTo(Tienkamper t) {
        return naam.compareTo(t.naam);
    }
}
