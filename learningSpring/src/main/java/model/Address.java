package model;

public class Address {

    private String city;
    private String mobileNumber;

    public Address(String city, String mobileNumber) {
        this.city = city;
        this.mobileNumber = mobileNumber;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
