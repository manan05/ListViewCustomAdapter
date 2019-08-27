package com.example.listviewcustomadapter;

import java.util.ArrayList;

//These are called as POJO
//POJO = Plain Old Java Objects

public class Teacher {
    String name;
    String course;

    //Constructor using Alt+Insert
    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    //Getter using Alt+Insert
    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public static ArrayList<Teacher> get8RandomTeachers() {
        //We now creater a new ArrayList and add the data
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Jager", "ADS"));
        teachers.add(new Teacher("Rook", "Armour"));
        teachers.add(new Teacher("Thermite", "Exothermic Charge"));
        teachers.add(new Teacher("Kapkan", "EDD"));
        teachers.add(new Teacher("Sledge", "Hammer"));
        teachers.add(new Teacher("Ash", "Rocket Launcher"));
        teachers.add(new Teacher("Blitz", "Flash Shield"));
        teachers.add(new Teacher("Doc", "Stim Pistol"));

        return teachers; // Here we return the ArrayList !

    }
}
