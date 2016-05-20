/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Interfete.IAngajatiBuilder;

/**
 *
 * @author Tudor
 */
public class AngajatiBuilder implements IAngajatiBuilder{
    private Angajati angajat;
    
    public AngajatiBuilder() {
        this.angajat = new Angajati();
    }

    public AngajatiBuilder setNume(String nume) {
        angajat.setNume(nume);
        return this;
    }

    public AngajatiBuilder setVarsta(int varsta) {
        angajat.setVarsta(varsta);
        return this;
    }

    public AngajatiBuilder setFunctie(String functie) {
        angajat.setFunctie(functie);
        return this;
    }

    public AngajatiBuilder setVechime(int vechime) {
        angajat.setVechime(vechime);
        return this;
    }

    public AngajatiBuilder setExperienta_domeniu(int experienta_domeniu) {
        angajat.setExperienta_domeniu(experienta_domeniu);
       return this;
    }

    @Override
    public Angajati build() {
        return angajat;
    }
    
    
}
