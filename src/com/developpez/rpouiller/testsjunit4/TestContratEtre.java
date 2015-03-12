package com.developpez.rpouiller.testsjunit4;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsSame;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.IsInstanceOf;

public class TestContratEtre {

    @Test
    public void classeDeString() {
        Assert.assertThat("texte", Is.isA(String.class));
    }

    @Test
    public void classeDeInteger() {
        Assert.assertThat((Object)"texte", IsInstanceOf.instanceOf(Integer.class));
    }

    @Test
    public void egal() {
        Assert.assertThat("texte", CoreMatchers.is("texte"));
    }

    @Test
    public void pasEgal() {
        Assert.assertThat("Texte", Is.is("texte"));
    }

    @Test
    public void pareil() {
        Assert.assertThat("texte", Is.is(IsSame.sameInstance("texte")));
    }

    @Test
    public void pasPareil() {
        Assert.assertThat(new String("texte"), Is.is(IsSame.sameInstance("texte")));
    }
}