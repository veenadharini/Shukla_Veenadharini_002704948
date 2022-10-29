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
public class PersonDirectory {
    
    public ArrayList<Person>persondir;
    
    public PersonDirectory(){
        this.persondir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersondir() {
        return persondir;
    }

    public void setPersondir(ArrayList<Person> persondir) {
        this.persondir = persondir;
    }
    
    public Person addNewPerson(){
        
        Person  newPerson = new Person();
        persondir.add(newPerson);
        return newPerson;
    }
    
}
