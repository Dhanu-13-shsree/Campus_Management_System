package com.campus.model;

//Encapsulation data hiding
//instant variables
public class Student {
    private int studentId;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;


    //static variables
    static int studentCount = 0;


    //Default Constructor


    public Student(){
        studentCount++;
    }


    //Parametrized Constructor
public Student(int studentId, String studentname, int age, String department, int[] marks){
    this.studentId = studentId;
    this.studentname =  studentname;
    this.age = age;
    this.department = department;
    this.marks = marks;
    studentCount++;
}

//getters

public int getStudentId() {
   return studentId;
}
public String getStudentname() {
   return studentname;
}
public int getAge() {
   return age;
}
public String getDepartment() {
   return department;
}
public int[] getMarks() {
   return marks;
}

//Setters

public void setStudentId(int studentId){
    this.studentId = studentId; 
}
public void setStudentname(String studentname){
    this.studentname = studentname; 
}
public void setAge(int age){
    this.age = age; 
}
public void setDepartment(String department){
    this.department = department; 
}
public void setMarks(int[] marks){
    this.marks = marks; 
}
public void displayStudentInfo(boolean showMarks) {

    if(showMarks) {
        System.out.println("Marks:" +java.util.Arrays.toString(marks));
    }
}

//static method belongs to class, not to object
public static void displayStudent
}
