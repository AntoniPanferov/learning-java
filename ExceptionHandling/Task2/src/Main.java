public class Main {
    public static void main(String[] args) {
        Bruch bruch = new Bruch(1, 0);
        Bruch bruch1 = bruch.kehr();


        try {
            double ergebnis = bruch.getDezimal();
            double ergebnis1 = bruch1.getDezimal();
            System.out.println(ergebnis);
            System.out.println(ergebnis1);
        } catch (BruchTest.DivisionByZeroException ex){
            System.out.println(String.format("Error %s", ex.getMessage()));
        }
    }
}