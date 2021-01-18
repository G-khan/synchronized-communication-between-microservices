package com.gokhana.paymentservice.model;

public class PayRequest {

    private String paymentType;
    private String bankId;
    private String payDetail;

    public PayRequest() {
    }

    public PayRequest(String paymentType, String bankId, String payDetail) {
        this.paymentType = paymentType;
        this.bankId = bankId;
        this.payDetail = payDetail;
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

    public String getPayDetail() {
        return payDetail;
    }

    public void setPayDetail(String payDetail) {
        this.payDetail = payDetail;
    }

    @Override
    public String toString() {
        return "PayRequest{" +
                "paymentType='" + paymentType + '\'' +
                ", bankId='" + bankId + '\'' +
                ", payDetail='" + payDetail + '\'' +
                '}';
    }
}
