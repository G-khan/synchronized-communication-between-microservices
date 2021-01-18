package com.gokhana.paymentservice.model;

public class PaymentDTO {
    private Integer id;
    private String paymentType;
    private String bankId;
    private Double amount;

    public PaymentDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "id=" + id +
                ", paymentType='" + paymentType + '\'' +
                ", bankId='" + bankId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
