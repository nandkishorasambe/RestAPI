
package com.coffe.coffe.controller;

import com.coffe.coffe.Services.CourseService;
import com.coffe.coffe.entities.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    private CourseService courseService;
    
    
    @GetMapping("/courses")
    public List<Course>getCourses(){
      
       return this.courseService.getCourses();
    } 
    
    
    @GetMapping("/courses/{courseId}")
    public Course getCourses(@PathVariable String courseId){
        
        return this.courseService.getCourses(Long.parseLong(courseId));
        
    }  
    
    //@PostMapping(path="/courses",consumes="application/json")
    @PostMapping("/courses")
    public Course addCourses(@RequestBody Course course)
    {
        return this.courseService.addCourses(course);
    }
    
    @PutMapping("/courses")
    public Course updateCourses(@RequestBody Course course){
        return this.courseService.updateCourses(course);
    }
    
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.courseService.deleteCourses(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(NumberFormatException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
