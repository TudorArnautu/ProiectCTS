/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Clase.AngajareFacade;
import Clase.Angajati;
import Clase.AngajatiBuilder;
import Clase.CV;
import Clase.CVAdaptat;
import Clase.CandidatAcceptat;
import Clase.DepartamentSingleton;
import Clase.PosibilAngajat;

/**
 *
 * @author Tudor
 */
public class Main {
    public static void main(String[] args) {
        
        //apel singleton
        System.out.println("SINGLETON");
        System.out.println();
        
        DepartamentSingleton departament = DepartamentSingleton.getInstance("HR", 45);
        System.out.println(departament.toString());
        
        DepartamentSingleton departament1 = DepartamentSingleton.getInstance("Financiar", 50);
        System.out.println(departament1.toString());
        
        //conditie pentru singleton
        if(departament != departament1) {
            System.out.println("Nu este singleton.");
        }else {
            System.out.println("Este singleton.");
        }
        
        System.out.println("--------------------------------------------------");
        
        //Builder
        System.out.println("BUILDER");
        System.out.println();
        
        Angajati angajat = new AngajatiBuilder().setNume("Ionescu Andreea").setVarsta(29).setFunctie("programator").setVechime(6).build();
        System.out.println(angajat.toString());
        
        System.out.println("--------------------------------------------------------------------------------");
        
        //Prototype 
        System.out.println("PROTOTYPE + BUILDER");
        System.out.println();
        
        Angajati angajat1 = new Angajati();
        Angajati angajat2 = (Angajati)angajat1.clone();
        
        //protopype+builder
        angajat2 = new AngajatiBuilder().setVechime(8).build();
        System.out.println(angajat1.toString());
        System.out.println(angajat2.toString());
        
        System.out.println("--------------------------------------------------------------------------------");
        
        //Facade + Chain of Responsibility + Observer + Decorator
        System.out.println("FACADE + CHAIN OF RESPONSIBILITY + OBSERVER + DECORATOR");
        System.out.println();
        
        PosibilAngajat pangajat = new PosibilAngajat("Ionescu Paul", 1);
        AngajareFacade.procesAngajare(pangajat);
        
        PosibilAngajat pangajat2 = new PosibilAngajat("Popescu Laurentiu", 2);
        AngajareFacade.procesAngajare(pangajat2);
        
        PosibilAngajat pangajat3 = new PosibilAngajat("Marin Mihaela", 3);
        AngajareFacade.procesAngajare(pangajat3);
        
        PosibilAngajat pangajat4 = new PosibilAngajat("Stefanescu Maria", 4);
        AngajareFacade.procesAngajare(pangajat4);
        
        System.out.println("--------------------------------------------------------------------------------");
        
        //Adator
        System.out.println("ADAPTOR");
        System.out.println();
        
        CV cv = new CV();
        CVAdaptat cvAdaptat = new CVAdaptat(cv);
        cvAdaptat.Language();
        
        System.out.println("--------------------------------------------------------------------------------");
        
        
        
        
       
    }
}
