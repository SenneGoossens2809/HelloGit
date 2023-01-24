package be.vdab.git.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Klinkers {

    public static void main(String[] args) {

        char[] klinkers =  {'a', 'e', 'i', 'o', 'u'};
        var aantalKlinkers = 0;

        Scanner scanner = new Scanner(System.in);
        var zin = scanner.nextLine();

        for (int i = 0; i < zin.length(); i++) {
            char letter = zin.toLowerCase().charAt(i);
            System.out.println(letter);

            for (var klinker : klinkers) {
                if (klinker == letter) {
                    aantalKlinkers++;
                }
            }
        }

        System.out.println("Aantal Klinkers: " + aantalKlinkers);
    }

}
