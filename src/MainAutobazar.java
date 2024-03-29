public class MainAutobazar {
    public static void main(String[] args) {
        Autobazar bazar = new Autobazar("Šikmá 10", 5000000);
        // Vytvoření testovacích dat
        Auto skoda120 = new Auto("123ABC", "Škoda 120", 10000);
        Auto skodaFabia = new Auto("456DEF", "Škoda Fabia", 100000);
        Auto ferrari = new Auto("789GHI", "Ferrari FF", 3000000);
        NakladniAuto tatra = new NakladniAuto("534NGS", "Tatra 811", 50000, 20000);
        NakladniAuto renault = new NakladniAuto("489GSR", "Renault Midliner", 100000, 30000);
        // Přidání aut do bazaru
        bazar.pridejAuto(skoda120);
        bazar.pridejAuto(skodaFabia);
        bazar.pridejAuto(ferrari);
        bazar.pridejAuto(tatra);
        bazar.pridejAuto(renault);
        // Výpis statistik
        System.out.println("V bazaru je " + bazar.getPocetAut() + " automobilů");
        System.out.println("Na pokladně je " + bazar.getPokladna() + " Kč");
        System.out.println("Celková cena automobilů je " + bazar.spoctiCenuAut() + " Kč");
    }
}