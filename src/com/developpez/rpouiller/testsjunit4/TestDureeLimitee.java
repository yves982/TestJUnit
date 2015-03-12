package com.developpez.rpouiller.testsjunit4;

import org.junit.Test;

public class TestDureeLimitee {

    @Test(timeout=1000)
    public void dureeRespectee() {
        
    }

    @Test(timeout=1000)
    public void dureeNonRespectee() throws InterruptedException {
        Thread.sleep(10000);
    }
}