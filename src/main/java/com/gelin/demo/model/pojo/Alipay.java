package com.gelin.demo.model.pojo;

public class Alipay {
    private String traceNo;
    private double totalAmount;
    private String subject;
    private String alipayTraceNo;
    private String outRequestAndTradeNo;

    public String getOutRequestAndTradeNo() {
        return outRequestAndTradeNo;
    }

    public void setOutRequestAndTradeNo(String outRequestAndTradeNo) {
        this.outRequestAndTradeNo = outRequestAndTradeNo;
    }

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAlipayTraceNo() {
        return alipayTraceNo;
    }

    public void setAlipayTraceNo(String alipayTraceNo) {
        this.alipayTraceNo = alipayTraceNo;
    }
}
