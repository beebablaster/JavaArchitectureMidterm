public class Main {
    public static void main(String[] args) {

        Laptop[] laptops = new Laptop[]{new Laptop("Lenovo Legion 3000", 1500000), new Laptop("Macbook Pro", 2000000)};
        Mobile[] mobilePhones = new Mobile[]{new Mobile("IPhone 14", 820000), new Mobile("IPhone 12", 520300)};

        Salesman salesman = new Salesman("David Ulanov", 9876543210L, "77075554433", LegalEntity.LLP, 1234567890, laptops, mobilePhones);

        salesman.sellLaptop(laptops[0]);
        salesman.sellMobile(mobilePhones[0]);

        salesman.viewSalesReport();

        Buyer buyer = new Buyer("John Doe", 123456789012L, "77075554432", "1234567890123456", CreditCardType.VISA, 2000.0);

        buyer.changeNumber("77070000000");
        System.out.println("New Phone Number: " + buyer.getPhoneNumber());

        buyer.changeFullName("Damir Syzdykov");
        System.out.println("New Full Name: " + buyer.getFullName());

        Basket basket = new Basket(buyer.getCreditCardBalance());
        double purchaseAmount = 5000.0;
        boolean purchaseResult = basket.makePurchase(purchaseAmount, buyer, salesman);
        System.out.println("Purchase Result: " + (purchaseResult ? "Success" : "Failure"));

        Buyer invalidCreditCardBuyer = new Buyer("Invalid Buyer", 9876543210L, "77075554432", "2131341", CreditCardType.MASTERCARD, 5000.0);

        Mobile mobilePhoneDiscountTest = new Mobile("Samsung Galaxy g420", 100020);
        Laptop laptopDiscountTest = new Laptop("Acer Predator 322", 225000);

        mobilePhoneDiscountTest.discount(10);
        laptopDiscountTest.discount(15);

        System.out.println("Mobile Price after 10% discount: " + mobilePhoneDiscountTest.getPrice());
        System.out.println("Laptop Price after 15% discount: " + laptopDiscountTest.getPrice());
    }
}