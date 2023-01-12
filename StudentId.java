
package com.coffe.coffe.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class StudentId {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long rollNo;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="subject")
    private String subject;
    
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="course_Id")
    @JsonBackReference
    private Course course;
    
    public StudentId(){
        super();
    }
    
    public StudentId(long rollNo, String firstName, String lastName, String subject,Course course) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.course = course;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

   
     
}
