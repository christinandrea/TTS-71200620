package com.rplbo.vehicle;

public class MotorVehicle extends Vehicle{

    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmission transmission;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Tire getTire() {
        return tire;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

}
