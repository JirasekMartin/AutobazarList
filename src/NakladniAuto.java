public class NakladniAuto extends Auto {
    /**
     * Nosnost v kg
     */
    private int nosnost;

    /**
     * Inicializuje instanci
     *
     * @param spz     SPZ
     * @param znacka  Značka výrobce
     * @param cena    Cena v Kč
     * @param nosnost Nosnost v kg
     */
    public NakladniAuto(String spz, String znacka, int cena, int nosnost) {
        super(spz, znacka, cena);
        this.nosnost = nosnost;
    }

    /**
     * Vratí nosnost v kg
     *
     * @return Nosnost v kg
     */
    public int getNosnost() {
        return nosnost;
    }
}
