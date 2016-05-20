package Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.mockito.Mockito.*;
import Clase.Angajati;
import Clase.CandidatAcceptat;
import Clase.DepartamentSingleton;
import Clase.PosibilAngajat;
import Teste.StagiuAngajare;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Tudor
 */
public class JUnitTest {
    
    public JUnitTest() {
    }

    @Test
    public void testSingleton() {
        DepartamentSingleton d1 = DepartamentSingleton.getInstance("Popescu Ioan", 20);
	DepartamentSingleton d2 = DepartamentSingleton.getInstance("Ionescu Adrian", 45);
	assertEquals(d1,d2);
    }
    
    @Test
    public void testClone() { 
        Angajati ang = new Angajati();
        Angajati ang1 = ang.clone();
        assertSame(ang, ang1);
        
        Angajati ang2 = new Angajati();
        assertNotSame(ang2, ang);
    }
      
    @Test
    public void testVarsta() {
        Angajati ang = new Angajati("Paul","1940625646846");
	assertEquals(21,ang.Varsta());
    }
	
    @Test
    public void testGender() {
        Angajati ang = new Angajati("Ioan","1940404270868");
	Angajati ang1 = new Angajati("Ioana","2940808270868");
	assertEquals("M",ang.getSex());
	assertEquals("F",ang1.getSex());
    }
	
    @Test
    public void testCNP() {
        Angajati ang = new Angajati("Paul","19306253636846");
            ang.checkCNP();
            assertFalse(ang.checkCNP());
    }
    
    @Test
    public void testStadiu() {
        StagiuAngajare ang = new StagiuAngajare("1");
        StagiuAngajare ang1 = new StagiuAngajare("2");
        StagiuAngajare ang2 = new StagiuAngajare("3");
        StagiuAngajare ang3 = new StagiuAngajare("4");
        
	assertEquals("Candidatul este intervievat telefonic.",ang.getStadiu());
        assertEquals("Candidatul este intervievat de catre HR.",ang1.getStadiu());
        assertEquals("Candidatul este intervievat de catre tehnic.",ang2.getStadiu());
        assertEquals("Candidatul este angajat.",ang3.getStadiu());
    }
     
    private Angajati ang;
    
   
    @Before
    public void setUp() {
        ang = new Angajati();
    }
    
    @Test(expected=IllegalArgumentException.class)
	public void testEmptyString() {
            ang.setFunctie("");
	}
	
	@Test(expected=NullPointerException.class)
	public void testNull() {
            ang.setFunctie(null);
	}
        
        @After
        public void TearDown() {
            ang = null;
        }
        
    @Test
    public void testExperientaLaAngajare() {
        Angajati ang = new Angajati();
         
        int rezultat = ang.experientaLaAngajare(8, 3);
        int rezultat_asteptat = 5;
        assertEquals(rezultat_asteptat, rezultat);    
    }
     @Test
    public void testExperientaLaAngajareMock() {
        Angajati ang = mock(Angajati.class);
        Angajati ang2 = new Angajati();
        when(ang.getVechime()).thenReturn(10);
        when(ang.getExperienta_domeniu()).thenReturn(2);
        int rezultat = ang2.experientaLaAngajare(ang.getVechime(), ang.getExperienta_domeniu());
        int rezultat_asteptat =8;
        assertEquals(rezultat_asteptat, rezultat);    
    }
    
     @Test
    public void testExperientaLaAngajare1() throws Exception {
        Angajati ang = new Angajati();
         
        int scadere = ang.experientaLaAngajare(8, 3);
        if(scadere < 1 ) {
            throw new Exception("Angajatul are putina experienta.");
        } else {
            System.out.println("Angajat acceptat");
        }
        assertTrue(true);
        
    }
    
    @Test
    public void testVechime() {
        Angajati ang = new Angajati();
        Angajati ang2 = new Angajati();
        
        ang.setVechime(8);
        ang2.setVechime(6);
        assertTrue(ang.getVechime() > ang2.getVechime());
    }
    
    @Test
    public void testVechimeValExtreme() {
        Angajati ang = new Angajati();
        Angajati ang2 = new Angajati();
        
        ang.setVechime(Integer.MAX_VALUE);
        ang2.setVechime(6);
        assertTrue(ang.getVechime() > ang2.getVechime());
    }
    
    @Test
    public void testNume() {
        Angajati ang = new Angajati();
        ang.setNume("Ionescu Andrei");
        assertNotNull(ang.getNume());   
    }
    
    @Test
    public void testNumeNULL() {
        Angajati ang = new Angajati();
        ang.setNume(null);
        assertNull(ang.getNume());   
    }
    
    
}
