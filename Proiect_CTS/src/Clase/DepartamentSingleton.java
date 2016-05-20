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
public class DepartamentSingleton {
    private static DepartamentSingleton singleton = null;
    private String nume;
    private int nr_angajati;
    
    
    public DepartamentSingleton(String nume, int nr_ang) {
        this.nume = nume;
        this.nr_angajati = nr_ang;
    }
    
    public static DepartamentSingleton getInstance(String nume, int nr_ang) {
        if(singleton == null) {
            singleton = new DepartamentSingleton(nume, nr_ang);
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Departamentul " + nume + ", are " + nr_angajati + " angajati.";
    }
    
    
}
