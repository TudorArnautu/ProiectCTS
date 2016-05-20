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
public class InterviuTelefonic extends ProcesAngajare{
    
    @Override
    public void stadiuAngajare(PosibilAngajat angajat) {
        if(angajat.stadiu == 1) {
            System.out.println("Candidatul " + PosibilAngajat.nume + " este intervievat telefonic.");
            return;
        } 
        else {
            next.stadiuAngajare(angajat);
        }
    }
}
