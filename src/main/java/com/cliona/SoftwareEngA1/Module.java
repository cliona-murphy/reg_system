/**
 *
 * @author Clíona's PC
 */
package com.cliona.SoftwareEngA1;
import java.util.*;
        
public class Module {
    public String modName;
    public String modID;
    public ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<Course> courses = new ArrayList<Course>();
    
    public Module(String modName, String modID, ArrayList<Student> students, ArrayList<Course> courses){
        this.modName = modName;
        this.modID = modID;
        this.students = students; 
        this.courses = courses; 
    }
}


