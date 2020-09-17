package io.mohkeita.customerservice.model;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer accountId;
    private Double balance;
    private Integer customerId;
    private String accountType;
    private String branchCode;
    private String bank;

    public Account() {
    }

    public Account(Integer accountId, Double balance, Integer customerId, String accountType, String branchCode, String bank) {
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
