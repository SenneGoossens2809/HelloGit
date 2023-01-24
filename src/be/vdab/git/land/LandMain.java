package be.vdab.git.land;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LandMain {

    public static void main(String[] args) {

        List<Land> landen = new ArrayList<>();

        try {
            Land belgie= new Land("BE", "België", "Brussel", BigInteger.valueOf(11500000), BigDecimal.valueOf(30528));
            landen.add(belgie);
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }

        try {
            Land nederland = new Land("NL", "Nederland", "Amsterdam", BigInteger.valueOf(17530000), BigDecimal.valueOf(41434));
            landen.add(nederland);
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }

        landen.forEach(land -> {
            System.out.println(land.toString());
            System.out.println(land.berekenBevolkingsDichtheid());
        });
    }
}
