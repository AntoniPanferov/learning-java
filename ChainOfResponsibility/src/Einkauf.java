public class Einkauf {
    protected Ware ware;
    private int menge;

    public Einkauf(Ware ware, int menge) {
        this.ware = ware;
        this.menge = menge;
    }

    protected void verkaufeWare() {

    }

    public boolean willNochMehr() {
        return true;
    }

    public String toString() {
        return String.valueOf(menge) + ware;
    }
}
