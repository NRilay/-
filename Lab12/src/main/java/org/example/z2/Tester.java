package org.example.z2;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void showDetails(boolean showSalary) {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Salary: " + (showSalary ? salary : "Hidden"));
    }

    public void showDetails(boolean showSalary, boolean showExperience) {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Salary: " + (showSalary ? salary : "Hidden") + ", Experience: " + (showExperience ? experienceInYears : "Hidden"));
    }

    public static void staticMethod() {
        System.out.println("This is a static method in Tester class.");
    }
}

