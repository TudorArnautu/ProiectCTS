/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Interfete.Observer;
import Interfete.Subject;
import java.util.ArrayList;

/**
 *
 * @author Tudor
 */
public class CandidatAcceptat extends ProcesAngajare implements Subject {

    private ArrayList<Observer> lista_candidati = new ArrayList<>();
    
    @Override
    public void stadiuAngajare(PosibilAngajat angajat) {
         if(angajat.stadiu == 4) {
            notificare("Ai fost angajat");
            AngajatDecorator decorator = new DecizieAngajat(angajat.nume, angajat.stadiu);
            decorator.esteAngajat(true);
            System.out.println("Candidat decorat.");
            System.out.println("Candidatul " + PosibilAngajat.nume + " a fost angajat.");
        } 
        else {
            next.stadiuAngajare(angajat);
        }
    }

    @Override
    public void adaugaObserver(Observer o) {
        lista_candidati.add(o);
    }

    @Override
    public void stergeObserver(Observer o) {
       lista_candidati.remove(o);
    }

    @Override
    public void notificare(String mesaj) {
       for(Observer o : lista_candidati) {
           o.Update(mesaj);
       }
    }

    
    
}
