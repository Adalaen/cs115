package edu.ldsbc.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void temp() throws Exception {
        Student student = new Student("",0,0);
        student.setName("Reed");
        student.setAge(39);

        assertEquals("Reed", student.getName());
        assertEquals(39, student.getAge());

        //change name on person to robert
        student.setName("robert");
        assertEquals("robert", student.getName());



        Student student2 = new Student("",0,0);
        student2.setName("Mikel");
        student2.setAge(25);

        assertEquals("Mikel", student2.getName());
        assertEquals(25, student2.getAge());
    }
}