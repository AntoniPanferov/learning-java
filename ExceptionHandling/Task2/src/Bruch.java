public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public double getDezimal() throws BruchTest.DivisionByZeroException {
        if (nenner == 0) throw new BruchTest.DivisionByZeroException();
        return (double)zaehler / (double)nenner;
    }

    public Bruch kehr() {
        return new Bruch(nenner, zaehler);
    }
}
