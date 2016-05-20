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
public class InterviuTehnic extends ProcesAngajare{

    @Override
    public void stadiuAngajare(PosibilAngajat angajat) {
        if(angajat.stadiu == 3) {
            System.out.println("Candidatul " + PosibilAngajat.nume + " este intervievat de catre tehnic.");
            return;
        } 
        else {
            next.stadiuAngajare(angajat);
        }
    }

    
}
