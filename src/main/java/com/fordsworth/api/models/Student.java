package com.fordsworth.api.models;

public class Student {

    private String name;
    private String class_room;
    private int year;
    private int grade;

    public Student() {
    }

    public Student(String name, String class_room, int year, int grade) {
        this.name = name;
        this.class_room = class_room;
        this.year = year;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class_room='" + class_room + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                '}';
    }
}
