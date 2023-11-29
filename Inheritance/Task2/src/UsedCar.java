public class UsedCar extends Car {
    protected int mileage;
    protected int mileageThresholdForDiscount = 20000;
    protected double priceReductionPercentage = 0.1;
    protected int minimumPrice = 2000;

    public UsedCar(double newCarPrice, int constructionYear, String model, int mileage) {
        super(newCarPrice, constructionYear, model);
        this.mileage = mileage;
    }

    public double getPrice() {
        double price = newCarPrice;
        price -= mileage / mileageThresholdForDiscount * newCarPrice * priceReductionPercentage;
        if (price < minimumPrice) return minimumPrice;
        return price;
    }
}
