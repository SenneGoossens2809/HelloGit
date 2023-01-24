package be.vdab.git.beginletter;

import java.util.ArrayList;
import java.util.HashMap;

public class BeginLetter {

    public static void main(String[] args) {

        var list = new ArrayList<String>();

        list.add("Appel");
        list.add("Aardbei");
        list.add("Peer");
        list.add("Banaan");

        var map = new HashMap<String, Integer>();

        for(var woord : list) {
            String letter = String.valueOf(woord.charAt(0));
            map.putIfAbsent(letter, 0);

            map.replace(letter, map.get(letter) + 1);
        }

        System.out.println("Aantal woorden per letter:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
        System.out.println("De HashMap heeft " + map.size() + " entries!");
        System.out.println();

        if (map.isEmpty()) {
            System.out.println("De HashMap is leeg!");
        } else {
            System.out.println("De HashMap is niet leeg!");
        }
        System.out.println();

        System.out.println("Alle values van de map:)");
        for (var value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("Alle keys van de map:");
        for (var key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("Alle entries van de map:");
        for (var entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
