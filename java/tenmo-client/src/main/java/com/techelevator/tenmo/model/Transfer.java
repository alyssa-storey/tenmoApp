package com.techelevator.tenmo.model;

import io.cucumber.java.sl.In;

import java.math.BigDecimal;

public class Transfer {

    private int transferId;
    private int transferType;
    private int transferStatus;
    private int accountFrom;
    private int accountTo;
    private BigDecimal transferAmount;

    public Transfer(int transferId, int transferType, int transferStatus, int accountFrom, int accountTo, BigDecimal transferAmount) {
        this.transferId = transferId;
        this.transferType = transferType;
        this.transferStatus = transferStatus;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.transferAmount = transferAmount;
    }

    public int getTransferId() {
        return transferId;
    }

    public int getTransferType() {
        return transferType;
    }

    public int getTransferStatus() {
        return transferStatus;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public void setTransferType(int transferType) {
        this.transferType = transferType;
    }

    public void setTransferStatus(int transferStatus) {
        this.transferStatus = transferStatus;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }
}