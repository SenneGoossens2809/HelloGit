package be.vdab.git.oefeningen;

public class StudentScores {

    public static void main(String[] args) {
        byte wiskunde = 8;
        byte engels = 6;
        byte nederlands = 9;
        byte godsdientst = 4;
        int totaal = wiskunde + engels + nederlands + godsdientst;
        var gemiddelde = totaal / 4;
        var percentage = totaal / 40 * 100;

        System.out.println("De gemiddelde score is " + gemiddelde);
        System.out.println("Het behaalde percentage is " + percentage);
    }
}
