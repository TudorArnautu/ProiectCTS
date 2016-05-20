package Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.mockito.Mockito.*;
import Clase.DepartamentSingleton;
import Teste.Vector;
import java.util.ArrayList;
import junit.framework.*;
import static junit.framework.TestCase.fail;

/**
 *
 * @author Tudor
 */
public class JUnitTeste extends TestCase{  
    
    Vector angajati;
    ArrayList<Integer> vectorNou = new ArrayList<Integer>();
    
    public JUnitTeste(String method) {
        super(method);
    }
    
    public void setUp() {
        this.vectorNou.add(-1);
        this.vectorNou.add(0);
        this.vectorNou.add(2);
        this.vectorNou.add(3);
        this.vectorNou.add(4);
        
        try {
            this.angajati = new Vector(vectorNou);
        } catch (Exception ex) {
            fail("Constructorul a aruncat eroare cu vector ne-null ca parametru");
        }
    }
    
    public JUnitTeste() {
    }

    //verificare corectitudine contstructor
    public void testVerificareConstructor() {
        assertNotNull(this.angajati);
    }
    
    //verificare suma elemente Right
    public void testVerificareSumaElementeRight() {
        int suma = 0;
        for (int i = 0; i < this.vectorNou.size(); i++) {
            suma += this.vectorNou.get(i);
        }

        assertEquals(suma, this.angajati.sumaElemente());
    }
    
    
    public void testVerificareMaximParRIGHT() {
        try {
            assertEquals(4, this.angajati.maximPar());
        }
        catch (Exception e) {
            fail("Nu ar trebui sa arunce exceptie");
        }
    }
    
    public void testConstructorParamNullError() {
        try {
            Vector ang2 = new Vector(null);
            
            fail("Nu exista exceptie pentru null");
        }
        catch (Exception e) {
            assertEquals("Vectorul este null", e.getMessage());
        }
    }
       
    public void testVerificareMaximParError() {
        ArrayList<Integer> vectorNou2 = new ArrayList<Integer>();
        vectorNou2.add(-1);
        vectorNou2.add(1);
        vectorNou2.add(3);
        vectorNou2.add(5);
        vectorNou2.add(7);

        try {
            Vector ang2 = new Vector(vectorNou2);
            
            ang2.maximPar();
        }
        catch (Exception e) {
            assertEquals("Nu am gasit numere pare", e.getMessage());
        }
    }
    
    public void testVerificareMaximParBoundary() {
        try {
            ArrayList<Integer> ang2 = new ArrayList<Integer>();
            Vector ang = new Vector(ang2);
            
            ang.maximPar();
        }
        catch (Exception e) {
            assertEquals("Nu sunt elemente", e.getMessage());
        }
    }
    
        
    public void testVerificareSumaElementeBoundary() {
        try {
            ArrayList<Integer> vectorNou2 = new ArrayList<Integer>();
            Vector vector2 = new Vector(vectorNou2);
            
            int suma = vector2.sumaElemente();
            assertEquals(0, suma);
        }
        catch (Exception e) {
            fail("exceptie aruncata la apelul sumaElemente");
        }
    }
    
    public static junit.framework.Test suite() {
        TestSuite suite = new TestSuite();
           
        // RIGHT
        suite.addTest(new JUnitTeste("testVerificareSumaElementeRight"));
        suite.addTest(new JUnitTeste("testVerificareSumaElementeRight"));
        suite.addTest(new JUnitTeste("testVerificareMaximParRIGHT"));
        
        // Error
        suite.addTest(new JUnitTeste("testConstructorParamNullError"));
        suite.addTest(new JUnitTeste("testVerificareMaximParError"));

        // Boundary
        suite.addTest(new JUnitTeste("testVerificareMaximParBoundary"));
        suite.addTest(new JUnitTeste("testVerificareSumaElementeBoundary"));

        return suite;
  }
    
    
}
