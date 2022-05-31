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

    public void test() {
        String anotherVariable = "StringLiteral";
        String age = anotherVariable;

        int n;
        int num = 5 + 10;
        int num2 = num + 10;
        boolean isFree = true;
        boolean bC = 10 == 20;
        boolean bA = (isFree || false);
        boolean bB = isFree && bA || bC && true;

        var unary = +10;
        var mult = 4 * 2;
        var rel = 20;
        var eq = false;
        var and = true;
        var or = false;
        boolean exp = (((((-10 * unary) + mult) > rel) == eq) || and) && or;

        // - PreInc
        // UnaryCond * UnaryCond
        // MultCond + MultCond
        // AddCond < AddCond
        // RelCond == RelCond
        // EqCond && EqCond
        // AndCond || AndCond
        // OrCond

        num2 += num + 1000;

    }

}
