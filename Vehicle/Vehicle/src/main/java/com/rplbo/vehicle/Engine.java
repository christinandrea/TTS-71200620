package com.rplbo.vehicle;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String type, int capacity) {
        this.fuelType = type;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }
}
