package be.vdab.git.oefeningen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Geboorte {

    public static void main(String[] args) {
        System.out.println("Geboortedatum (dd/mm/yyyy): ");
        var scanner = new Scanner(System.in);

        var geboorteDatum = scanner.nextLine();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var date = LocalDate.parse(geboorteDatum, formatter);

        System.out.println("U bent geboren op een " + date.getDayOfWeek());
        var jarenTussen = ChronoUnit.YEARS.between(date, LocalDate.now());
        System.out.println("U bent " + jarenTussen + " jaar");
    }
}
