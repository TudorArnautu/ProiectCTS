/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Tudor
 */
public class AngajareFacade {
    public static void procesAngajare(PosibilAngajat angajat) {
        InterviuTelefonic it = new InterviuTelefonic();
        InterviuHR ih = new InterviuHR();
        InterviuTehnic ith = new InterviuTehnic();
        
        CandidatAcceptat candidat = new CandidatAcceptat();
        
        candidat.adaugaObserver(angajat);
        
        it.next = ih;
        ih.next = ith;
        ith.next = candidat;
        it.stadiuAngajare(angajat);
        
    }
}
