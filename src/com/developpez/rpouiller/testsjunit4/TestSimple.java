package com.developpez.rpouiller.testsjunit4;

import org.junit.Assert;
import org.junit.Test;

public class TestSimple {

    @Test
    public void additionAvecDeuxNombres() {
        final long lAddition = Operations.additionner(10, 20);
        Assert.assertEquals(30, lAddition);
    }

    @Test
    public void additionAvecCinqNombres() {
        final long lAddition = Operations.additionner(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(7936, lAddition);
    }

    @Test
    public void mutiplicationAvecDeuxNombres() {
        final long lMultiplication = Operations.multiplier(10, 20);
        Assert.assertEquals(300, lMultiplication);
    }
    
    public void testMutiplicationAvecCinqNombres() {
        final long lMultiplication = Operations.additionner(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(1125899906842624L, lMultiplication);
    }
}