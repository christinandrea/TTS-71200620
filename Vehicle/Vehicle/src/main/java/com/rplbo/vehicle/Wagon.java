package com.rplbo.vehicle;

public class Wagon extends Vehicle {
    private String pullers;
    private Wheel wheel;

    public Wheel getWheel() {
        return wheel;
    }

    public String getPullers() {
        return pullers;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setPullers(String pullers) {
        this.pullers = pullers;
    }
}
