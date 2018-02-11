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

        Subject subject_1 = new SubjectName("Bake a Cake");
        //teacher_1.teach(subject_1);

        Subject subject_2 = new SubjectName("Use Git");
        //teacher_2.teach(subject_2);


        // Call methods

        for (int i = 0; i < studentsList.size(); i++) {

            go(studentsList.get(i));
        }

        for (int i = 0; i < teachersList.size(); i++) {
            go(teachersList.get(i), subject_1);
        }

        int i = 0;
        roomsList.get(i).accept(teachersList.get(i));

        teacher_1.teach(subject_1);
        teacher_2.teach(subject_2);



    }

    private static void go(Student someone) {
        System.out.println(String.format("There is %s in the room!", someone.name()));
        someone.learn();
        System.out.println("");
    }

    private static void go(Teacher someone, Subject someSubject) {
        System.out.println(String.format("There is %s in the room also.", someone.name()));
        someone.teach(someSubject);
        System.out.println("");


    }

}
//* Previous implementations without arrays
//
//package net.comments.sample;
//
//
//public class App {
//    public static void main(String[] args) {
//        Student andrey = new AttentiveStudent("Andrey");
//        Student nastya = new AttentiveStudent("Nastya");
//        Student dima = new BadStudent("Dima");
//
//        Teacher vasya = new TeacherOne("Vasya");
//
//        Room roomOne = new TrainingRoom();
//
//        go(andrey);
//        go(nastya);
//        go(dima);
//
//        go(vasya);
//
//        roomOne.accept(andrey);
//
//    }
//
//    private static void go(Student someone) {
//        System.out.println(String.format("There is %s in the room!", someone.name()));
//        someone.learn();
//    }
//    private static void go(Teacher someone) {
//        System.out.println(String.format("There is %s in the room also.", someone.name()));
//        someone.teach();
//
//
//    }
//
//}