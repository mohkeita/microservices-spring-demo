package io.mohkeita.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

    @Id
    @Column(name="CUSTOMERID")
    private Integer customerId;

    @Column(name="CUSTOMERNAME")
    private String customerName;

    @Column(name="MOBILE")
    private String mobile;

    @Column(name="EMAIL")
    private String email;

    @Column(name="CITY")
    private String city;

    @Transient
    private List<Account> account;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String mobile, String email, String city, List<Account> account) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.account = account;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", account=" + account +
                '}';
    }
}
