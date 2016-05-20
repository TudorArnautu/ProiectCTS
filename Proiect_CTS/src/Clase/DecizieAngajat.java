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
public class DecizieAngajat extends AngajatDecorator{

    
    
    public DecizieAngajat(String nume, int stadiu) {
        super(nume, stadiu);
    }

    @Override
    public void esteAngajat(boolean decizie) {
        if(decizie == true) {
            System.out.println("Candidatul este angajat.");
        } else {
            System.out.println("Candidatul este respins.");
        }
    }
    
}
