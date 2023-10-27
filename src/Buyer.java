public class Buyer extends User {
    private CreditCardType creditCardType;
    private String creditCardNumber;
    private double creditCardBalance;

    public Buyer(String fullName, Long iin, String phoneNumber, String creditCardNumber, CreditCardType creditCardType, double creditCardBalance) {
        super(fullName, iin, phoneNumber);
        if(creditCardNumber.length() != 16){
            throw new IllegalArgumentException("creditCardNumber should be 16 characters long!");
        }
        this.creditCardNumber = creditCardNumber;
        this.creditCardType = creditCardType;
        this.creditCardBalance = creditCardBalance;
    }

    public void changeNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void changeFullName(String data) {
        this.fullName = data;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }

    public void setCreditCardBalance(double creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }
}
