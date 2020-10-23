package com.cliona.SoftwareEngA1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegSystemTest {
	
	ArrayList<Course> courses = new ArrayList<Course>();
    ArrayList<Module> compModules = new ArrayList<Module>();
    ArrayList<Student> compStudents = new ArrayList<Student>();
    Student s1, s2;
    Course c1;
    Module m1;
    LocalDate DOB;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception { 
		DOB = new LocalDate(23/10/2020);
		s1 = new Student("Sean Byrne", 21, DOB, "123", "s.byrne", courses, compModules);
		s2 = new Student("Tara Blake", 21, DOB, "124", "t.blake", courses, compModules);
		compStudents.add(s1);
		compStudents.add(s2);
		
		c1 = new Course("Computer Science", compModules, compStudents);
		courses.add(c1);
		
		m1 = new Module("Programming", "CT123", compStudents, courses);
		compModules.add(m1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("s.byrne21", s1.getUsername());
	}

}
