package com.company;

public abstract class Telescope {
    private float diameter;
    private int fLength;

    public Telescope(float diameter, int fLength) {
        if(diameter>0 && fLength>0) {
            this.diameter = diameter;
            this.fLength = fLength;
        }
    }

    public float getDiameter() {
        return diameter;
    }

    public int getfLength() {
        return fLength;
    }

    public void setDiameter(float diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        }
    }

    public void setfLength(int fLength) {
        if (fLength > 0) {
            this.fLength = fLength;
        }
    }

    @Override
    public String toString() {
        return "Telescope: " +
                "diameter=" + diameter +
                ", fLength=" + fLength;
    }

    public abstract boolean hasColorError();
}
