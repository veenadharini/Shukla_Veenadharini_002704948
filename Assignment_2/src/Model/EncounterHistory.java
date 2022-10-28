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
    
    private ArrayList<Encounter> encounterhist;
    
    public EncounterHistory(){
        this.encounterhist = new ArrayList<Encounter>();
        
    }

    public ArrayList<Encounter> getEncounterhist() {
        return encounterhist;
    }

    public void setEncounterhis(ArrayList<Encounter> encounterhist) {
        this.encounterhist = encounterhist;
    }

    
    
    
}
