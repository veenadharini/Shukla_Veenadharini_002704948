/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee_Data;

import java.util.ArrayList;

/**
 *
 * @author Veenadharini25
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee>directory;
    
    public EmployeeDirectory(){
        
        this.directory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }
            
    public Employee addNewEmployee(){    //new method to add employees to array list
        
        Employee newEmp = new Employee();
        directory.add(newEmp);
        return newEmp;
        
    }
    
    public void deleteEmployee(Employee e){
        directory.remove(e);
      
    
        
    }
            
            
}
