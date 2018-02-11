package net.comments.sample;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ///// Students
        List<Student> studentsList = new ArrayList<Student>();

        Student student_1 = new AttentiveStudent("Andrey");
        Student student_2 = new AttentiveStudent("Nastya");
        Student student_3 = new BadStudent("Dima");

        studentsList.add(student_1);
        studentsList.add(student_2);
        studentsList.add(student_3);

        ///// Teachers

        List<Teacher> teachersList = new ArrayList<Teacher>();

        Teacher teacher_1 = new TechTeacher("Dmitriy Sergeevich");
        Teacher teacher_2 = new TechTeacher("Aleksandr Vladimirovich");

        teachersList.add(teacher_1);
        teachersList.add(teacher_2);

        ///// Rooms

        List<Room> roomsList = new ArrayList<Room>();

        Room room_1 = new CookingRoom();
        Room room_2 = new TrainingRoom();

        roomsList.add(room_1);
        roomsList.add(room_2);

        // Subjects

        List<Subject> subjectsList = new ArrayList<Subject>();

        Subject subject_1 = new SubjectName("Bake a Cake");
        Subject subject_2 = new SubjectName("Use Git");

        subjectsList.add(subject_1);
        subjectsList.add(subject_2);


        ///// Call methods

//        int i;
//        do {
//            go(studentsList.get(i));
//            i = i+1;
//        }
//        while(i == studentsList.size());

        System.out.println("Go_student results:***********");
        go_student(student_1, subject_2);
        go_student(student_2, subject_1);
        go_student(student_3, subject_2);
        System.out.println();

        System.out.println("Go_room results:***********");
        go_room_teacher(room_1, teacher_1);
        go_room_teacher(room_2, teacher_2);
        System.out.println();

        System.out.println("Go_teacher results:***********");
        go_teacher(teacher_1, subject_1);
        go_teacher(teacher_2, subject_2);
        System.out.println();




    }

    private static void go_student(Student someStudent, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someStudent.name()));
        someStudent.learn(someSubject);
        System.out.println();
    }

    private static void go_room_teacher(Room someRoom, Teacher somePerson) {
        //System.out.println(String.format("Room contains %s", somePerson.accept()));
        someRoom.accept(somePerson);
        System.out.println();
    }

    private static void go_teacher(Teacher someTeacher, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someTeacher.name()));
        someTeacher.teach(someSubject);
        System.out.println();
    }

}
