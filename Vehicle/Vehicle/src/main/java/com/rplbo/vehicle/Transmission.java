package com.rplbo.vehicle;

public class Transmission {
    private String transType;
    private int numSpeed;

    public Transmission(String transType, int numSpeed) {
        this.numSpeed = numSpeed;
        this.transType = transType;
    }

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public int getNumSpeed() {
        return numSpeed;
    }

    public String getTransType() {
        return transType;
    }
}
