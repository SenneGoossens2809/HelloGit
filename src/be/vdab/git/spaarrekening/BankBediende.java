package be.vdab.git.spaarrekening;

public class BankBediende {

    public static void main(String[] args) {
        var rekeningen = new Rekening[4];
        rekeningen[0] = new Spaarrekening("BE11 2233 4455 6677", 1.5);
        rekeningen[1] = new Spaarrekening("BE99 8877 6655 4433", 1.5);
        rekeningen[2] = new Zichtrekening("BE19 2837 4655 6473", 2000);
        rekeningen[3] = new Zichtrekening("BE91 8273 6455 4637", 1500);

        rekeningen[0].storten(500.0);
        rekeningen[1].storten(550.0);
        rekeningen[1].afhalen(120.0);
        rekeningen[2].storten(200.0);
        rekeningen[2].afhalen(20.0);
        rekeningen[3].storten(300.0);

        for (var rekening : rekeningen) {
            if (rekening != null) {
                System.out.println("Saldo van de rekening: " + rekening.getSaldo());
            }
        }
    }
}
