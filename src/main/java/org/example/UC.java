package org.example;

import java.util.ArrayList;

public class UC {
    private String nameUC;
    private ArrayList<Mark> marks;
    private int totalStudents;

    public UC(String nameCU, int totalStudents) {
        this.nameUC = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }


    public void insertMarkCU(int numStudent, double mark) {
        marks.add(new Mark(numStudent, mark));
    }


    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                return m.getMark();
            }
        }
        return -1;
    }


    public double averageUC() {
        double sum = 0;
        for (Mark m : marks) {
            sum += m.getMark();
        }
        return marks.size() > 0 ? sum / marks.size() : 0;
    }


    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
}
