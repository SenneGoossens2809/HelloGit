package be.vdab.git.oefeningen;

public class OmrekeningSeconden {

    public static void main(String[] args) {
        var totaalSeconden = 5924;
        var uren = totaalSeconden / 3600; //3600 seconden in een uur
        var rest = totaalSeconden % 3600;

        var minuten = rest / 60;
        var seconden = rest % 60;

        System.out.println("Uren: " + uren + " Minuten: " + minuten + " Seconden: " + seconden);
    }
}
