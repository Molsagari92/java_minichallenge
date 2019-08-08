package com.company;

public final class RefactorTelescope extends Telescope {
    private int numberOfLenses;

    public RefactorTelescope(float diameter, int fLength, int numberOfLenses) {
        super(diameter, fLength);
        if(numberOfLenses>0) {
            this.numberOfLenses = numberOfLenses;
        }
    }

    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) {
        if(numberOfLenses>0) {
            this.numberOfLenses = numberOfLenses;
        }
    }

    @Override
    public boolean hasColorError() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+", " +
                "numberOfLenses=" + numberOfLenses;
    }
}
