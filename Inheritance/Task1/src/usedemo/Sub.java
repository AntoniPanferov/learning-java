package usedemo;
import demo.Super;

public class Sub extends Super {
    private int attribute1 = 5;

    public void hello() {
        System.out.println("Subclass");
        System.out.println(attribute1);
        // attribute2 is not directly accessible in this subclass
        // because it belongs to the superclass and is declared as private.
        //System.out.println(attribute2);
        System.out.println(attribute3);
        System.out.println(attribute4);
    }
}