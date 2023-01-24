package be.vdab.git.land;

public class LandException extends RuntimeException {

    public LandException() {

    }

    public LandException(String omschrijving) {
        super(omschrijving);
    }
}
