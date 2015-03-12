package com.developpez.rpouiller.testsjunit4;

import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArray.array;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class TestContratCollectionIsArray {

    @Test
    public void elementsEgaux() {
        assertThat(new Integer[]{1, 2}, array(is(1), is(2)));
    }

    @Test
    public void elementsDifferents() {
        assertThat(new Integer[]{1, 2}, array(is(1), is(3)));
    }
}