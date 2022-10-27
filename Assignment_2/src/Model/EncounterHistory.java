/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Veenadharini
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterhis;
    
    public EncounterHistory(){
        this.encounterhis = new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterhis() {
        return encounterhis;
    }

    public void setEncounterhis(ArrayList<Encounter> encounterhis) {
        this.encounterhis = encounterhis;
    }

    
    
    
}
