package be.vdab.git.oefeningen;

public class SnoepAutomaat {

    public static void main(String[] args) {
        var ingave = 2;
        var kost = 0.42;
        var terug = ingave * 100 - (int) (kost * 100);

        System.out.println("De kost van het snoepje is " + ingave + " en de ingave was " + kost);
        System.out.println("U krijg in totaal " + terug + " cent(en) terug!");

        var munt100 = terug / 100;
        terug -= 100 * 100;

        var munt50 = terug / 50;
        terug -= 50 * 50;

        var munt20 = terug / 20;
        terug -= 20 * 20;

        var munt10 = terug / 10;
        terug -= 10 * 10;
    }
}
