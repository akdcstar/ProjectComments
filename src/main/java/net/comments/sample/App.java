package net.comments.sample;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Students
        List<Student> studentsList = new ArrayList<Student>();

        Student student_1 = new AttentiveStudent("Andrey");
        Student student_2 = new AttentiveStudent("Nastya");
        Student student_3 = new BadStudent("Dima");

        studentsList.add(student_1);
        studentsList.add(student_2);
        studentsList.add(student_3);

        // Teachers

        List<Teacher> teachersList = new ArrayList<Teacher>();

        Teacher teacher_1 = new TechTeacher("Dmitriy Sergeevich");
        Teacher teacher_2 = new TechTeacher("Aleksandr Vladimirovich");

        teachersList.add(teacher_1);
        teachersList.add(teacher_2);

        // Rooms

        List<Room> roomsList = new ArrayList<Room>();

        Room room_1 = new TrainingRoom();

        roomsList.add(room_1);

        // Subjects

        List<Subject> subjectsList = new ArrayList<Subject>();

        Subject subject_1 = new SubjectName("Bake a Cake");
        Subject subject_2 = new SubjectName("Use Git");

        subjectsList.add(subject_1);
        subjectsList.add(subject_2);


        // Call methods

//        int i = 0;
//        do {
//            go(studentsList.get(i));
//            i = i+1;
//        }
//        while(i == studentsList.size());


        for (int i = 0; i < studentsList.size(); i++) {

            go(studentsList.get(i), subject_1);
        }

        for (int i = 0; i < teachersList.size(); i++) {
            go(teachersList.get(i), subjectsList.get(i));
        }

        int i = 0;
        roomsList.get(i).accept(teachersList.get(i));
        System.out.println();


//        teacher_1.teach(subject_1);
//        teacher_2.teach(subject_2);

    }

    private static void go(Student someOne, Subject someSubject) {
        System.out.println(String.format("There is %s in the room!", someOne.name()));
        someOne.learn(someSubject);
        System.out.println("");
    }

    private static void go(Teacher someOne, Subject someSubject) {
        System.out.println(String.format("There is %s in the room also.", someOne.name()));
        someOne.teach(someSubject);
        System.out.println("");


    }

}
