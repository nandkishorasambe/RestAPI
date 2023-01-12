
package com.coffe.coffe.Services;

import com.coffe.coffe.Dao.CourseDao;
import com.coffe.coffe.entities.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseSericeImpl implements CourseService{
    
    @Autowired
    private CourseDao courseDao;
   
    public CourseSericeImpl(){
     
    }
    
    @Override
    public List<Course> getCourses() {
       return (List<Course>)courseDao.findAll();
     
    }

    @Override
    public Course getCourses(long courseId) {
        
        return courseDao.getOne(courseId);
    } 
  
    @Override
    public Course addCourses(Course course) {
      return courseDao.save(course);
    }
   
    @Override
    public Course updateCourses(Course course){
        return courseDao.save(course);
    }
    
    @Override
    public void deleteCourses(long parseLong){
       Course entity=courseDao.getOne(parseLong);
       courseDao.delete(entity);
      
    }
  
    }
    
    
    

