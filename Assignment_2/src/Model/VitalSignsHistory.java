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
public class VitalSignsHistory {
 
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
        this.history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitalSigns(){
        VitalSigns vs = new VitalSigns();
        history.add(vs);
        return vs;
        
    
    }
}

