package br.com.devdojo.model;

import javax.persistence.Entity;

@Entity
public class Student extends AbstractEntity {

    private String name;

    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
