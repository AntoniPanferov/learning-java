public enum Ware {
    KAESE("Käse"), WURST("Wurst"), EIER("Eier"), BIER("Bier"), BROT("Brot");

    private String beschreibung;

    private Ware(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String toString() {
        return beschreibung;
    }
}
