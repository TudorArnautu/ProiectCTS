/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Interfete.ICV;

/**
 *
 * @author Tudor
 */
public class CVAdaptat implements ICV{
    public CV cv;

    public CVAdaptat(CV cv) {
        this.cv = cv;
    }

    @Override
    public void Language() {
        cv.Language();
    }
    
}
