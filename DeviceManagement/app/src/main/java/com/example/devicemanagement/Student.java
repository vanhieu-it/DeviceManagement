package com.example.devicemanagement;

public class Student {
    private String id;
    private String name;
    private String classId;

    public Student(String id, String name, String classId) {
        this.id = id;
        this.name = name;
        this.classId = classId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
