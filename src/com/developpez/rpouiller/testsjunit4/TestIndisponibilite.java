package com.developpez.rpouiller.testsjunit4;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestIndisponibilite {

    @Test
    public void nonIgnore1() {
        
    }

    @Test
    public void nonIgnore2() {
        Assert.fail("Echec");
    }

    @Ignore
    @Test
    public void ignore() {
        Assert.fail("Echec ignoré");
    }
}