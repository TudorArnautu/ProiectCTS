/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

/**
 *
 * @author Tudor
 */
public class StagiuAngajare {
    private String stagiu;
    
    public StagiuAngajare(String stagiu) {
        this.stagiu = stagiu;
    }
    
    public String getStadiu(){
		switch(stagiu.charAt(0)){
			case '1': return "Candidatul este intervievat telefonic.";
			case '2': return "Candidatul este intervievat de catre HR.";
			case '3': return "Candidatul este intervievat de catre tehnic.";
			case '4': return "Candidatul este angajat.";
			
		}
		return "N/A";
    }
}
