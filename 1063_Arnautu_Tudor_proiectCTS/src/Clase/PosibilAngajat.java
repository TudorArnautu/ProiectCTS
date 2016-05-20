/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Interfete.Observer;

/**
 *
 * @author Tudor
 */
public class PosibilAngajat implements Observer{
    public static String nume;
    public int stadiu;
    
    public PosibilAngajat(String nume, int stadiu) {
        this.nume = nume;
        this.stadiu = stadiu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setStadiu(int stadiu) {
        this.stadiu = stadiu;
    }

    @Override
    public void Update(String mesaj) {
       System.out.println("Mesaj: " + mesaj);
    }
    
    
    
    
    
}
