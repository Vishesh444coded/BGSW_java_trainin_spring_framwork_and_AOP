package model;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;

public class Customer {

    private int custId;
    private String customer;
    private double balance;

    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer(int custId, String customer, double balance) {
        this.custId = custId;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer() {
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("cust Id "+ custId);
        System.out.println("Customer Name " + customer);
        System.out.println("Customer Balance " + balance);
        System.out.println("city is " + address.getCity());
        System.out.println("Mobile Number is " + address.getMobileNumber());
    }
}
