package com.company;

public final class NewtonTelescope extends Telescope {
     private float secondMirrorSize;

    public NewtonTelescope(float diameter, int fLength, float secondMirrorSize) {
        super(diameter, fLength);
        if(secondMirrorSize>0) {
            this.secondMirrorSize = secondMirrorSize;
        }
    }

    public float getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(float secondMirrorSize) {
        if(secondMirrorSize>0) {
            this.secondMirrorSize = secondMirrorSize;
        }
    }


    @Override
    public boolean hasColorError() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+", " +
                "secondMirrorSize=" + secondMirrorSize;
    }
}
