package com.developpez.rpouiller.testsjunit4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAvantApresEnsemble {

    @BeforeClass
    public static void avantTests() {
        System.out.println("------------------------");
        System.out.println("Avant Tests");
        System.out.println("------------------------");
    }
    
    @AfterClass
    public static void apresTests() {
        System.out.println("------------------------");
        System.out.println("Apr�s Tests");
        System.out.println("------------------------");
    }
    
    @Test
    public void premierTest() {
        System.out.println("Premier Test");
    }

    @Test
    public void deuxiemeTest() {
        System.out.println("Deuxi�me Test");
    }

    @Test
    public void troisiemeTest() {
        System.out.println("Troisi�me Test");
    }
}