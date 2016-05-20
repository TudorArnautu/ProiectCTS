/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Interfete.IAngajatPrototype;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Tudor
 */
public class Angajati implements IAngajatPrototype{
    private String nume;
    private int varsta;
    private String functie;
    private int vechime;
    private int experienta_domeniu;
    public String CNP;
    
    
    public Angajati() {
        this.nume = "Popescu Andrei";
        this.varsta = 27;
        this.functie = "consultant";
        this.vechime = 6;
        this.experienta_domeniu = 3;
        this.CNP = "1923456563423";
    }
    
    public Angajati(String nume, int varsta, String functie, int vechime, int experienta) {
        this.nume = nume;
        this.varsta = varsta;
        this.functie = functie;
        this.vechime = vechime;
        this.experienta_domeniu = experienta;
        
    }
    
    public Angajati(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setFunctie(String functie) {
        if(functie == null) {
            throw new NullPointerException();
        } else if(functie == "") {
            throw new IllegalArgumentException();
        } else {
        this.functie = functie;
        }
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public void setExperienta_domeniu(int experienta_domeniu) {
        this.experienta_domeniu = experienta_domeniu;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getFunctie() {
        return functie;
    }

    public int getVechime() {
        return vechime;
    }

    public int getExperienta_domeniu() {
        return experienta_domeniu;
    }

    @Override
    public String toString() {
        return "Angajatul " + nume + ", are " + varsta + " ani, ocupa functia de " + functie + ", cu o vechime de " + 
                vechime + " ani, si cu o experienta in domeniu de " + experienta_domeniu + " ani.";
    }

    
    public Angajati clone() {
        return this;
    }
    
    public String getSex(){
	switch(CNP.charAt(0)){
            case '1': return "M";
            case '2': return "F";
            case '3': return "M";
            case '4': return "F";
            case '5': return "M";
            case '6': return "F";
	}
    return "N/A";
    }
    
    public int Varsta(){
		
	Calendar c = Calendar.getInstance();
	int an = 0;
	switch(CNP.charAt(0)) {
            case '1': {
                an = 1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
            break;
            }
            case '2': {
		an = 1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
            break;
            }
            case '3': {
		an = 1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
            break;
            }
            case '4': {
		an = 1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
            break;
            }
            case '5': {
		an = 2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)); 
            break;
            }
            case '6': {
		an = 2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
            break;
            }
        }
	System.out.println("anul este: "+an);
	int luna = Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4));
	int zi = Integer.parseInt("" + CNP.charAt(4) + CNP.charAt(5));
	c.set(an, luna, zi);
	Calendar c1 = Calendar.getInstance();
	long dif = c1.getTimeInMillis()-c.getTimeInMillis();
	int ani = (int) (TimeUnit.MILLISECONDS.toDays(dif)/365);
	return ani;
    }

   
    public boolean checkCNP(){
        if (CNP.length()!=13) 
            return false;
	for(int i = 0;i<=12;i++) {
	if(CNP.charAt(i)>'9' ||CNP.charAt(i) < '0')
            try {
		throw new Exception("wrong format");
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
                }
	}
            int s=0;
            String number="279146358279";
            for(int i=0;i<12;i++){
		s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+CNP.charAt(i));			
            }
            int cifra=s%11;
            if(cifra==10)
                cifra=1;
            return cifra==Integer.parseInt(""+CNP.charAt(12));
    }
    
    public int experientaLaAngajare(int vechime, int experienta) {
        int rezultat = vechime - experienta; 
        return rezultat;
    }
}
