package com.rplbo.vehicle;

public class Tire {
    private String tireType;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;

    public Tire(String tireType, int aspectRatio, int width, int wheelDiameter) {
        this.tireType = tireType;
        this.aspectRatio = aspectRatio;
        this.width = width;
        this.wheelDiameter = wheelDiameter;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public int getWidth() {
        return width;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public String getTireType() {
        return tireType;
    }
}
