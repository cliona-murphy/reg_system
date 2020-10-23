/**
 *
 * @author Clíona's PC
 */
package com.cliona.SoftwareEngA1;
import java.util.*;

import org.joda.time.LocalDate;
        
public class Student {
    public String name;
    public int age;
    public LocalDate DOB;
    public String ID;
    public String uName;
    ArrayList<Course> courses = new ArrayList<Course>();
    ArrayList<Module> modules = new ArrayList<Module>();
    
    public Student(String name, int age, LocalDate DOB, String ID, String uName, ArrayList<Course> courses, ArrayList<Module> modules){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.uName = uName;
        this.courses = courses;
        this.modules = modules;                
    }
    
    public String getUsername(){
        String username = uName + Integer.toString(age);
        return username;
    }
}


