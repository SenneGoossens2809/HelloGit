package be.vdab.git.voertuigen;

public class TestProgramma {

    public static void main(String[] args) {
        Personenwagen personenwagen = new Personenwagen("Senne Goossens",
                15000, 160, 6, "2BTB 365 25", 4, 5);

        Vrachtwagen vrachtwagen = new Vrachtwagen();

        vrachtwagen.setPolishouder("Senne Goossens");

        System.out.println(vrachtwagen);
        System.out.println(vrachtwagen.toon());
    }
}
