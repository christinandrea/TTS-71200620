package com.rplbo.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine name, Transmission type, Tire tire, Wheel wheel, int capacity) {
        this.setEngine(name);
        this.setTransmission(type);
        this.setTire(tire);
        this.setWheel(wheel);
        this.capacity = capacity;


    }

    @Override
    public void backward() {
        super.backward();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void forward() {
        super.forward();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }
}
