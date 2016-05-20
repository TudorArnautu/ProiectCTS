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
public class InterviuHR extends ProcesAngajare{

    @Override
    public void stadiuAngajare(PosibilAngajat angajat) {
        if(angajat.stadiu == 2) {
            System.out.println("Candidatul " + PosibilAngajat.nume + " este intervievat de catre HR.");
            return;
        } 
        else {
            next.stadiuAngajare(angajat);
        }
    }
    
}
