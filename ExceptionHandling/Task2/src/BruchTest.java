public class BruchTest {
    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException() {
            super("Division by zero is not allowed");
        }
    }

}
