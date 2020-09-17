package io.mohkeita.accountservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "ACCOUNTS")
@Entity
public class Account implements Serializable {

    @Id
    @Column(name="ACCOUNTID")
    private Integer accountId;

    @Column(name="BALANCE")
    private Double balance;

    @Column(name="CUSTOMERID")
    private Integer customerId;

    @Column(name="ACCOUNTTYPE")
    private String accountType;

    @Column(name="BRANCHCODE")
    private String branchCode;

    @Column(name="BANK")
    private String bank;

    public Account() {
    }

    public Account(Integer accountId, Double balance, Integer customerId, String accountType, String branchCode,
                   String bank) {
        this.accountId = accountId;
        this.balance = balance;
        this.customerId = customerId;
        this.accountType = accountType;
        this.branchCode = branchCode;
        this.bank = bank;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", customerId=" + customerId +
                ", accountType='" + accountType + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
