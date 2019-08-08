package com.company;

public class Main {

    public static void main(String[] args) {
	NewtonTelescope newtonTelescope=new NewtonTelescope(50, 600, 100);
	System.out.println(newtonTelescope.toString());
	RefactorTelescope refactorTelescope=new RefactorTelescope(100, 650, 3);
	System.out.println(refactorTelescope.toString());
    }
}
