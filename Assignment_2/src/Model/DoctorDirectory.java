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
public class DoctorDirectory {
    
    private ArrayList<Doctor> docdir;
    
    public DoctorDirectory(){
        this.docdir = new ArrayList<Doctor>();
        
    }

    public ArrayList<Doctor> getDocdir() {
        return docdir;
    }

    public void setDocdir(ArrayList<Doctor> docdir) {
        this.docdir = docdir;
    }
    
    
}
