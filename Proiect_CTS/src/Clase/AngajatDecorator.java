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
public abstract class AngajatDecorator {
    public String nume;
    public int stadiu;

    public AngajatDecorator(String nume, int stadiu) {
        this.nume = nume;
        this.stadiu = stadiu;
    }
    
    public abstract void esteAngajat(boolean decizie);    
    
}
