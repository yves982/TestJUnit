package com.developpez.rpouiller.testsjunit4;

import java.io.Serializable;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

public class TestContratClasseInstance {

    @Test
    public void classeDeString() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(String.class));
    }

    @Test
    public void classeDeSerializable() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(Serializable.class));
    }

    @Test
    public void classeDeCharSequence() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(CharSequence.class));
    }

    @Test
    public void classeDeInteger() {
        Assert.assertThat("texte", IsInstanceOf.instanceOf(Integer.class));
    }
}