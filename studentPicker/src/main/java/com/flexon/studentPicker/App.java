package com.flexon.studentPicker;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        String[] names = {"Abby Truong",
        "Ahmed Mujtaba",
        "Azeez Temitope Olanrewaju",
        "Deep",
        "Diming Chu",
        "Dongshuo Li",
        "Honorinicy",
        "Jason",
        "Junyu Liu",
        "Kelly Liu",
        "Kinjan",
        "Kun Li",
        "Muhammed Umar",
        "Oaz",
        "PQ",
        "Prithviatani",
        "Richard",
        "Sahil Singh Sandhu",
        "Samuel Yang",
        "Scott(Shi-Kai) Jhou",
        "Shahbaz Mansahia",
        "Shahriar Kabir",
        "Shakur",
        "Shrina Patel",
        "Siyu Qiu",
        "Siyu Lei",
        "Sumid",
        "Tao",
        "Trivediakshay",
        "Yan Huang",
        "Zhaosaitong"};
        StudentPicker studentPikcer = new StudentPicker();
        String pickedName = studentPikcer.getName(names);
        JOptionPane.showMessageDialog(null, pickedName, "Call Student:", 1);
    }
}
