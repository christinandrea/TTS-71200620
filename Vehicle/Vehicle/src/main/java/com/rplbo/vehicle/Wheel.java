package com.rplbo.vehicle;

public class Wheel {
    private int width;
    private int diameter;

    public Wheel(int width, int diameter) {
        this.diameter = diameter;
        this.width = width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }
}
