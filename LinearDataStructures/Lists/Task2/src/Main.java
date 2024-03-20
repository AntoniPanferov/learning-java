public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(2, 4);
        System.out.println(sphere.calculateVolume());
        System.out.println(sphere.calculateSurfaceArea());

        Cone cone = new Cone(2, 4);
        System.out.println(cone.calculateVolume());
        System.out.println(cone.calculateSurfaceArea());
    }
}