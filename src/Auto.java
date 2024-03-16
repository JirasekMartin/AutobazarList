

public class Auto {
    /**
     * SPZ
     */
    private String spz;

    /**
     * Značka výrobce
     */
    private String znacka;

    /**
     * Cena v Kč
     */
    private int cena;

    /**
     * Inicializuje instanci
     *
     * @param spz    SPZ
     * @param znacka Značka výrobce
     * @param cena   Cena v Kč
     */
    public Auto(String spz, String znacka, int cena) {
        this.spz = spz;
        this.znacka = znacka;
        this.cena = cena;
    }

    /**
     * Vratí SPZ
     *
     * @return SPZ
     */
    public String getSpz() {
        return spz;
    }

    /**
     * Vratí značku
     *
     * @return Značku
     */
    public String getZnacka() {
        return znacka;
    }

    /**
     * Vratí cenu
     *
     * @return cena
     */
    public int getCena() {
        return cena;
    }
}
