package edu.ldsbc.Assignment6;

import java.util.ArrayList;
import java.util.List;

public class Courses {

    private List<CourseOffering> courseList;

    public Courses(ArrayList<CourseOffering> courseList) {
        this.courseList = courseList;
    }

    public CourseOffering searchByName(String name) throws UnsupportedOperationException{
        CourseOffering courseOffering = null;

        int min = 0;
        int max = courseList.size() -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            courseOffering = courseList.get(mid);
            int comp = courseOffering.getCourseName().compareTo(name);

            if (comp == 0) {
                return courseOffering;
            } else if (comp < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        throw new UnsupportedOperationException("Error no Course with that Course Name Listed");
    }

    public CourseOffering searchByNumber(int number) throws Exception{
        CourseOffering courseOffering = null;
        int min = 0;
        int max = courseList.size() -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            courseOffering = courseList.get(mid);
            int comp = courseOffering.getCourseNumber();

            if (comp == number) {
                return courseOffering;
            } else if (comp < number) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        throw new Exception();
    }
}