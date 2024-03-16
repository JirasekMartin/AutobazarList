import java.util.ArrayList;
public class Autobazar {
    /**
     * Adresa autobazaru
     */
    private String adresa;

    /**
     * Peníze na pokladně
     */
    private int pokladna;

    /**
     * Kolekce automobilů
     */
    private ArrayList<Auto> auta = new ArrayList<>();

    /**
     * Inicializuje novou instanci
     *
     * @param adresa   Adresa autobazaru
     * @param pokladna Peníze na pokladně
     */
    public Autobazar(String adresa, int pokladna) {
        this.adresa = adresa;
        this.pokladna = pokladna;
    }

    /**
     * Vratí počet aut v bazaru
     *
     * @return Počet aut v bazaru
     */
    public int getPocetAut() {
        return auta.size();
    }

    /**
     * Vratí peníze na pokladně
     *
     * @return Peníze na pokladně
     */
    public int getPokladna() {
        return pokladna;
    }

    /**
     * Přidá/koupí auto a přidá ho do bazaru
     *
     * @param auto Auto k přidání
     */
    public void pridejAuto(Auto auto) {
        if (auto.getCena() <= pokladna) {
            // Přidá auto do listu
            auta.add(auto);
            // Odečte peníze z pokladny, jelikož majitel bazaru za auto zaplatil
            pokladna -= auto.getCena();
        }
    }

    /**
     * Prodá auto z bazaru
     *
     * @param auto Auto k prodeji
     */
    public void prodejAuto(Auto auto) {
        // Odstranění auta z listu
        auta.remove(auto);
        // Přičtení peněz do pokladny
        pokladna += auto.getCena();
    }

    /**
     * Vrátí celkovou cenu všech aut v bazaru
     *
     * @return Celková cena všech aut v bazaru v Kč
     */
    public int spoctiCenuAut() {
        int cena = 0;
        for (int i = 0; i < auta.size(); i++) {
            cena += auta.get(i).getCena();
        }
        return cena;
    }
}
