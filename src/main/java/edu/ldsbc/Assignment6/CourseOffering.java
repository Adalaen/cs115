package edu.ldsbc.Assignment6;

import java.time.LocalTime;

public class CourseOffering {

    private int courseNumber;
    private String courseName;
    private String instructor;
    private char[] section = new char[2];
    private String room;
    private LocalTime time;
    private char[] days = new char[5];
    private int capacity;

    public CourseOffering(int courseNumber, String courseName, String instructor, char[] section,
                          String room, LocalTime time, char[] days, int capacity) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.instructor = instructor;
        this.section = section;
        this.room = room;
        this.time = time;
        this.days = days;
        this.capacity = capacity;
    }

    public String toString(){
        return "";
    }

    public String getDays(){
        return "";
    }

}