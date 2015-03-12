package com.developpez.rpouiller.testsjunit4;

import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;

public class TestContratPareil {

    @Test
    public void pareil() {
        // Remarque : c'est la même instance à cause du cache
        Assert.assertThat("texte", IsSame.sameInstance("texte"));
    }

    @Test
    public void pasPareil() {
        // Remarque : ce n'est pas la même instance parce que new String() force une nouvelle instance.
        Assert.assertThat(new String("texte"), IsSame.sameInstance("texte"));
    }
}