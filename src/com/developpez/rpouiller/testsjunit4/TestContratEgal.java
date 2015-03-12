package com.developpez.rpouiller.testsjunit4;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class TestContratEgal {

    @Test
    public void egal1() {
        Assert.assertThat("texte", IsEqual.equalTo("texte"));
    }

    @Test
    public void egal2() {
        Assert.assertThat(new String("texte"), IsEqual.equalTo("texte"));
    }

    @Test
    public void pasEgal1() {
        Assert.assertThat("Texte", IsEqual.equalTo("texte"));
    }

    @Test
    public void pasEgal2() {
        Assert.assertThat(new String("Texte"), IsEqual.equalTo("texte"));
    }
}