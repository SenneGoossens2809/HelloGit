package be.vdab.git.tienkamp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TienkamperMain {

    public static void main(String[] args) {

        List<Tienkamper> tienkampers = new ArrayList<>();

        Tienkamper athleet = new Tienkamper("Senne", 30);
        Tienkamper athleet2 = new Tienkamper("Stijn", 20);
        Tienkamper athleet3 = new Tienkamper("Jan", 25);

        tienkampers.add(athleet);
        tienkampers.add(athleet2);
        tienkampers.add(athleet3);

        for (var eenTienkamper : tienkampers) {
            System.out.println(eenTienkamper);
            System.out.println();
        }

        var set = new TreeSet<Tienkamper>();
        set.add(athleet);
        set.add(athleet2);
        set.add(athleet3);

        for (var eenTienkamper : set) {
            System.out.println(eenTienkamper);
            System.out.println();
        }
    }
}
