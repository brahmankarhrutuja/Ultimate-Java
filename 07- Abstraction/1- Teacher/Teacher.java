package com.kodnest.oops.abstraction;

public abstract class Teacher {
   abstract void markAttendance();
   abstract void teach();
}

public class JavaTeacher extends Teacher {
    void markAttendance() {
        System.out.println("Java teacher is marking attendance at beginning of class.");
    }
    void teach() {
        System.out.println("Java teacher is teaching java.");
    }
}

public class SQLTeacher extends Teacher {
    void markAttendance() {
        System.out.println("SQL teacher is marking attendance at beginning of class.");
    }
    void teach() {
        System.out.println("SQL teacher is teaching SQL.");
    }
}

public class ClassRoom {
    public void acceptTeacher(Teacher teacher) {
        teacher.markAttendance();
        teacher.teach();
 }
}

public class TeacherApp {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.acceptTeacher(new JavaTeacher());
        classRoom.acceptTeacher(new SQLTeacher());
    }
}