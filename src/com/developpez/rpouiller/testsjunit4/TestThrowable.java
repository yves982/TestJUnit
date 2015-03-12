package com.developpez.rpouiller.testsjunit4;

import org.junit.Test;

public class TestThrowable {

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void divisionAvecUnNombre() {
        Operations.diviser(1);
    }

    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombresDontUnZero() {
        Operations.diviser(10, 0);
    }

    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombres() {
        Operations.diviser(10, 5);
    }
}