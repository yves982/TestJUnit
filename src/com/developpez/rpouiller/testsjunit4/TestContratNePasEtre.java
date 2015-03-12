package com.developpez.rpouiller.testsjunit4;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class TestContratNePasEtre {

    @Test
    public void egal() {
        Assert.assertThat("texte", IsNot.not("texte"));
    }

    @Test
    public void pasEgal() {
        Assert.assertThat("Texte", IsNot.not("texte"));
    }

    @Test
    public void pareil() {
        Assert.assertThat("texte", IsNot.not(IsSame.sameInstance("texte")));
    }

    @Test
    public void pasPareil() {
        Assert.assertThat(new String("texte"), IsNot.not(IsSame.sameInstance("texte")));
    }
}