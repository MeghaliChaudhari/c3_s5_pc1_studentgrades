package com.marks;

public class StudentsMarksImpl {
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
        System.out.println("Calculated Marks Of Medical Pathway Student = " + obj.calculateMarks(50, 68, 80, 45));
        System.out.println("Calculated Marks Of Non-Medical Pathway Student = " + obj.calculateMarks(50.5,65.5,50));
        System.out.println("Calculated Marks Of Business Pathway Student = " + obj.calculateMarks(52.2));
    }
}
