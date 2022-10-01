/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Himanshu
 */
public class EmpOperations {
    
    private ArrayList<Employee>  empCrudOpertions;
      
    public EmpOperations()
    {
           this.empCrudOpertions = new ArrayList<Employee>();
           
    }

    public ArrayList<Employee> getEmpCrudOpertions() {
        return empCrudOpertions;
    }

    public void setEmpCrudOpertions(ArrayList<Employee> empCrudOpertions) {
        this.empCrudOpertions = empCrudOpertions;
    }

    public  Employee addNewRecord()
    {
        Employee newRecord = new Employee();
        empCrudOpertions.add(newRecord);
        return newRecord;
    }

    public void deleteEmpData(Employee emp) {
         empCrudOpertions.remove(emp);
    }
    

}
