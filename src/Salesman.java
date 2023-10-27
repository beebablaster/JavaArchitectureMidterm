public class Salesman extends User {
    private LegalEntity legalEntity;
    private int bankAccount;
    public Laptop[] laptops;
    public Mobile[] mobilePhones;
    private int laptopsSold;
    private int mobilePhonesSold;

    public Salesman(String fullName, Long iin, String phoneNumber, LegalEntity legalEntity, int bankAccount, Laptop[] laptops, Mobile[] mobilePhones) {
        super(fullName, iin, phoneNumber);
        this.legalEntity = legalEntity;
        this.bankAccount = bankAccount;
        this.laptops = laptops;
        this.mobilePhones = mobilePhones;
        this.mobilePhonesSold = 0;
        this.laptopsSold = 0;
    }

    public void changeNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void changeFullName(String data) {
        this.fullName = data;
    }

    public int getBankAccount(){
        return this.bankAccount;
    }

    public void setBankAccount(int newAmount){
        this.bankAccount = newAmount;
    }

    public void sellLaptop(Laptop laptop) {
        if (laptopsSold < laptops.length) {
            laptops[laptopsSold] = laptop;
            laptopsSold++;
            // Update the bank account with the laptop price
            bankAccount += laptop.getPrice();
        } else {
            System.out.println("Out of laptops. Cannot sell more.");
        }
    }

    public void sellMobile(Mobile mobile) {
        if (mobilePhonesSold < mobilePhones.length) {
            mobilePhones[mobilePhonesSold] = mobile;
            mobilePhonesSold++;
            // Update the bank account with the mobile price
            bankAccount += mobile.getPrice();
        } else {
            System.out.println("Out of mobile phones. Cannot sell more.");
        }
    }

    public void viewSalesReport() {
        System.out.println("Salesman: " + getFullName());
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Laptops Sold: " + laptopsSold);
        System.out.println("Mobiles Sold: " + mobilePhonesSold);
    }
}
