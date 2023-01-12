
package com.coffe.coffe.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;
    
    @Column(name="course_title")
    private String title;
    

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "course")// @PrimaryKeyJoinColumn
    @JsonManagedReference
    private StudentId  StudentId;
    
    public Course(long courseId, String title, StudentId StudentId) {
        super();
        this.courseId = courseId;
        this.title = title;
        this.StudentId = StudentId;
    }
    
    public Course(){
        super();
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StudentId getStudentId() {
        return StudentId;
    }

    public void setStudentId(StudentId StudentId) {
        this.StudentId = StudentId;
    }
  
  
}
