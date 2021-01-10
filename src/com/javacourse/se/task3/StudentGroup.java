package com.javacourse.se.task3;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGroup {

    private static Scanner scanner = new Scanner(System.in);
    private static final String SCHOOL_NAME = "Гимназия №1";
    private String groupName;
    private String[] namesOfStudents  = new String[25];
    private int[] marksOfStudents = new int[25];


    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    public void setNamesOfStudents() {
        for (int i = 0; i < namesOfStudents.length; i++) {
            System.out.println("Введите ФИО " + (i+1) + " ученика");
            namesOfStudents[i] = scanner.nextLine();
        }
    }

    public void getNamesOfStudents() {
        System.out.println("Ученики учебного заведения " + SCHOOL_NAME + " и класса "+ groupName);
        for (String i : namesOfStudents) System.out.print(i + " ");

    }

    public void setMarks() {
        for (int i = 0; i < marksOfStudents.length; i++) {
            System.out.println("Введите оценку " + (i+1) + " ученика");
            while (!scanner.hasNextInt()){
                System.out.println("Это не оценка, введите оценку " + (i+1) + " ученика");
                scanner.next();
            }
            marksOfStudents[i] = scanner.nextInt();
            if (marksOfStudents[i] < 0 || marksOfStudents[i] > 10){
                while (marksOfStudents[i] < 0 || marksOfStudents[i] > 10){
                    System.out.println("Оценка не может быть отрицательной или больше 10, введите оценку " + (i+1) + " ученика");
                    marksOfStudents[i] = scanner.nextInt();
                }
            }
        }
    }

    public void setRandomMarks() {
        for (int i = 0; i < marksOfStudents.length; i++){
            marksOfStudents[i] = (int) (Math.random() * 11);
        }
    }

    public void getMarksOfStudents() {
        System.out.println("Оценки учеников класса "+ groupName);
        for (int i : marksOfStudents) System.out.print(i + " ");
    }

    public void selectionSortOfMarks() {
        for (int i = 0; i < marksOfStudents.length; i++) {
            for (int j = i + 1; j < marksOfStudents.length; j++) {
                if(marksOfStudents[i] > marksOfStudents[j]) {
                    int temp = marksOfStudents[i];
                    marksOfStudents[i] = marksOfStudents[j];
                    marksOfStudents[j] = temp;
                }
            }
        }
    }

    public void arraysSortOfMarks() {
        Arrays.sort(marksOfStudents);
    }

    public static void guessMark(){
        for(int i = 10; i <= 10; i++){
            int number = (int) (Math.random() * i);
            while (true){
                System.out.println("введите оценку от 0 до " + i);
                int ourNumber = scanner.nextInt();
                if (ourNumber < 0 || ourNumber > i) {
                    System.out.println("Оценка вне диапазона");
                } else if (ourNumber == number){
                    System.out.println("Вы угадали!");
                    break;
                } else {
                    System.out.println("Вы не угадали");
                }
            }
        }
    }

}