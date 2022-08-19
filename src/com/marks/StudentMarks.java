package com.marks;

public class StudentMarks {
    public int calculateMarks(int math,int physics,int chemistry,int biology){
        return math + physics + chemistry + biology;
    }
    public double calculateMarks(double math,double physics,double chemistry){
        return math + physics + chemistry;
    }
    public double calculateMarks(double math){
        return math;
    }
}
