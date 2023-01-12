
package com.coffe.coffe.Services;

import com.coffe.coffe.entities.Course;
import java.util.List;

public interface CourseService {


    public List<Course>getCourses();

    public Course getCourses(long courseId);
    
    public Course addCourses(Course course);
    
    public void deleteCourses(long parseLong);

    public Course updateCourses(Course course);

    

   

        
}
