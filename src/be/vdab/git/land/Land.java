package be.vdab.git.land;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {

    private String landCode;
    private String landNaam;
    private String hoofdStad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdStad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        setLandCode(landCode);
        setLandNaam(landNaam);
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
        setHoofdStad(hoofdStad);
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        if (landCode.length() == 2) {
            this.landCode = landCode;
            return;
        }
        throw new LandException("Land code is incorrect!");
    }

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        if (landNaam != null && !landNaam.isEmpty()) {
            this.landNaam = landNaam;
            return;
        }
        throw new LandException("Landnaam kan niet null zijn!");
    }

    public String getHoofdStad() {
        return hoofdStad;
    }

    public void setHoofdStad(String hoofdStad) {
        if (hoofdStad != null && !hoofdStad.isEmpty()) {
            this.hoofdStad = hoofdStad;
            return;
        }
        throw new LandException("Hoofdstad kan niet null zijn!");
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) {
        if (aantalInwoners.compareTo(BigInteger.ZERO) > 0) {
            this.aantalInwoners = aantalInwoners;
            return;
        }
        throw new LandException("Aantal inwoners kan niet 0 of kleiner zijn!");
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(BigDecimal oppervlakte) {
        if (oppervlakte.compareTo(BigDecimal.ZERO) > 0) {
            this.oppervlakte = oppervlakte;
            return;
        }
        throw new LandException("Oppervlakte kan niet gelijk of kleiner zijn dan 0");
    }

    public BigDecimal berekenBevolkingsDichtheid() {
        return new BigDecimal(aantalInwoners).divide(oppervlakte, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return landCode + " ; " + landNaam + " ; " + hoofdStad + " ; " + aantalInwoners + " ; " + oppervlakte + " ; "
                + berekenBevolkingsDichtheid();
    }
}
