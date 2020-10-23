/**
 *
 * @author Clíona's PC
 */
package com.cliona.SoftwareEngA1;
import java.util.*;

public class Course {
    public String courseName;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
    
    
    public Course(String courseName, ArrayList<Module> modules2, ArrayList<Student> students2){
        this.courseName = courseName;
        this.modules = modules2; 
        this.students = students2; 
    }
}

