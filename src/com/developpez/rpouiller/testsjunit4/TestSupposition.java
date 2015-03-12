package com.developpez.rpouiller.testsjunit4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class TestSupposition {

    @Test
    public void verifierExistenceFichier() {
        final File lFile = new File("fichier.txt");
        Assert.assertTrue("Le fichier doit exister", lFile.exists());
    }
    
    @Test
    public void lireFichier() throws IOException {
        final File lFile = new File("fichier.txt");
        Assume.assumeTrue(lFile.exists());
        
        final FileInputStream lFileInputStream = new FileInputStream(lFile);
        final byte[] lBytes = new byte[16];
        lFileInputStream.read(lBytes);
        Assert.assertArrayEquals("Bonjour le monde".getBytes(), lBytes);
    }
}