package com.developpez.rpouiller.testsjunit4;

import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

public class TestContratValeurNull {

    @Test
    public void valeurNull1() {
        final String lTexte = null;
        Assert.assertThat(lTexte, IsNull.nullValue());
    }

    @Test
    public void valeurNull2() {
        final String lTexte = "texte";
        Assert.assertThat(lTexte, IsNull.nullValue());
    }

    @Test
    public void valeurPasNull1() {
        final String lTexte = null;
        Assert.assertThat(lTexte, IsNull.notNullValue());
    }

    @Test
    public void valeurPasNull2() {
        final String lTexte = "texte";
        Assert.assertThat(lTexte, IsNull.notNullValue());
    }
}