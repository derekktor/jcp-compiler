package utils;

import java.util.ArrayList;

public class Student extends Person {
    private float[] _grades;
    private ArrayList<Subject> _subjects;

    public Student() {
        super();
        _grades = new float[5];
    }

    public Student(String name, int age) {
        super(name, age);
        _grades = new float[5];
    }

}
