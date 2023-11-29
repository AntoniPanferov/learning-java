package demo;

public class Super {
    private   int attribute1 = 1;
              int attribute2 = 2;
    protected int attribute3 = 3;
    public    int attribute4 = 4;

    public void hello() {
        System.out.println("Superclass");
        System.out.println(attribute1);
        System.out.println(attribute2);
        System.out.println(attribute3);
        System.out.println(attribute4);
    }
}