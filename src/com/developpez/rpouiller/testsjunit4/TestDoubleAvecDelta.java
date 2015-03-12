package com.developpez.rpouiller.testsjunit4;

import org.junit.Assert;
import org.junit.Test;

public class TestDoubleAvecDelta {

    @Test
    public void valeursExactementEgales() {
        final double lResultat = Operations.soustraire(5, 2.5);
        Assert.assertEquals(2.5, lResultat, 0);
    }

    @Test
    public void valeursAvecUneLegereDifference() {
        final double lResultat = Operations.soustraire(71.19, 98);
        Assert.assertEquals(-26.81, lResultat, 0.005);
    }

    @Test
    public void valeursAvecUneDifferenceTropImportante() {
        final double lResultat = Operations.soustraire(71.19, 98);
        Assert.assertEquals(-26.81, lResultat, 0);
    }
}