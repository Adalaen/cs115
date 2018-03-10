package edu.ldsbc.Assignment6;

import org.junit.Test;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CoursesTest {
    CourseOffering a1 = new CourseOffering(0,"A","Hunter",
            new char['A'], "201", LocalTime.now(),
            new char['M'],25);

    CourseOffering b1 = new CourseOffering(1,"B","Hunter",
            new char['A'], "201", LocalTime.now(),
            new char['M'],25);

    CourseOffering b2 = new CourseOffering(2,"G","Hunter",
            new char['A'], "201", LocalTime.now(),
            new char['M'],25);

    CourseOffering h1 = new CourseOffering(3,"W","Hunter",
            new char['A'], "201", LocalTime.now(),
            new char['M'],25);
    CourseOffering z1 = new CourseOffering(4,"Z","Hunter",
            new char['A'], "201", LocalTime.now(),
            new char['M'],25);

    @Test
    public void searchByName() throws Exception {
        ArrayList<CourseOffering> courseList = new ArrayList<>(4);
        courseList.add(a1);
        courseList.add(b1);
        courseList.add(b2);
        courseList.add(h1);
        courseList.add(z1);

        Courses courses = new Courses(courseList);
        assertEquals(a1, courses.searchByName("A"));
        assertEquals(b1, courses.searchByName("B"));
        assertEquals(b2, courses.searchByName("G"));
        assertEquals(h1, courses.searchByName("W"));
        assertEquals(z1, courses.searchByName("Z"));
        try {
            courses.searchByName("P");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void searchByNumber() throws Exception {

        ArrayList<CourseOffering> courseList = new ArrayList<>(4);
        courseList.add(a1);
        courseList.add(b1);
        courseList.add(b2);
        courseList.add(h1);
        courseList.add(z1);

        Courses courses = new Courses(courseList);
        assertEquals(a1, courses.searchByNumber(0));
        assertEquals(b1, courses.searchByNumber(1));
        assertEquals(b2, courses.searchByNumber(2));
        assertEquals(h1, courses.searchByNumber(3));
        assertEquals(z1, courses.searchByNumber(4));
        try {
            courses.searchByNumber(10);
        } catch (Exception e){
            System.out.println("Error no Course with that Course Number Listed");
        }
    }

}