public abstract class User {
    String fullName;
    Long iin;
    String phoneNumber;

    public User(String fullName, Long iin, String phoneNumber) {
        this.fullName = fullName;
        this.iin = iin;
        this.phoneNumber = phoneNumber;
    }

    public abstract void changeNumber(String number);
    public abstract void changeFullName(String data);

    public String getFullName(){
        return this.fullName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

