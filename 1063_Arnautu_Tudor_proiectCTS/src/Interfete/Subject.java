/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfete;

/**
 *
 * @author Tudor
 */
public interface Subject {
    public void adaugaObserver(Observer o);
    public void stergeObserver(Observer o);
    public void notificare(String mesaj);
}
