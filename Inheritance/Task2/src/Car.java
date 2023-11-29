public class Car {
    protected double newCarPrice;
    protected int constructionYear;
    protected String model;

    public Car(double newCarPrice, int constructionYear, String model) {
        this.newCarPrice = newCarPrice;
        this.constructionYear = constructionYear;
        this.model = model;
    }

     public double getPrice() {
        return newCarPrice;
    }
}
