public class Basket {
    private double buyerBalance;

    public Basket(double buyerBalance) {
        this.buyerBalance = buyerBalance;
    }

    public boolean makePurchase(double amount, Buyer buyer, Salesman salesman) {
        if (amount <= buyer.getCreditCardBalance() && amount <= buyerBalance) {
            // Deduct the amount from buyer's credit card and balance
            buyer.setCreditCardBalance(buyer.getCreditCardBalance() - amount);
            buyerBalance -= amount;
            // Add the amount to the salesman's bank account
            salesman.setBankAccount((int) (salesman.getBankAccount() + amount));
            return true;
        } else {
            System.out.println("Insufficient funds for the purchase.");
            return false;
        }
    }
}
