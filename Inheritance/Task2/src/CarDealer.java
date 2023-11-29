// Extend this class so that a new class 'UsedCar' is created, which additionally stores the mileage.
// Write the necessary constructor for this purpose and override the method 'double getPrice()'
// so that after every 20,000 kilometers driven, the new car price of the car decreases by 10%. Note that the dealer
// has set a minimum price of €2,000 for every used car.


public class CarDealer {
    public static void main(String[] args) {
        // Given main()
        UsedCar car1 = new UsedCar(20000, 2002, "Audi TT", 70000);
        System.out.println("Price:" + car1.getPrice());
        Car car2 = car1;
        System.out.println("Price:" + car2.getPrice());

        // The results are the same because car2 inherits from car1, so the method getPrice() is inherited as well.
    }
}