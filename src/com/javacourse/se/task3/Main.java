package com.javacourse.se.task3;

public class Main {

  public static void main(String[] args) {

    StudentGroup studentGroup = new StudentGroup("7А");
    studentGroup.setNamesOfStudents();
    studentGroup.getNamesOfStudents();
    System.out.println();
    studentGroup.setMarks();
    studentGroup.getMarksOfStudents();
    studentGroup.selectionSortOfMarks();
    System.out.println();
    studentGroup.setRandomMarks();
    studentGroup.getMarksOfStudents();
    System.out.println();

  }


}
