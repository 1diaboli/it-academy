package com.javacourse.se;

import com.javacourse.se.task3.StudentGroup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        StudentGroup.guessNumber();
        
    }
}
