package com.javacourse.se;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import com.javacourse.se.task3.StudentGroup;

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
        StudentGroup.guessMark();




    }
}
