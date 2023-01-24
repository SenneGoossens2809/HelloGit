package be.vdab.git.strings;

import java.util.Scanner;

public class Rekenaar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var line = scanner.nextLine();
        String[] characters = line.split(" ");

        var totaal = 0;
        var eerste = Integer.parseInt(characters[0]);

        totaal += eerste;


        for (int i = 0; i <= characters.length; i+=2) {
            var expressie = characters[i + 1];
            var volgendeChar = Integer.parseInt(characters[i + 2]);

            switch (expressie) {
                case "+" -> totaal = totaal + volgendeChar;
                case "-" -> totaal = totaal - volgendeChar;
                case "*" -> totaal = totaal * volgendeChar;
                case "/" -> totaal = totaal / volgendeChar;
            }
        }




    }

}
