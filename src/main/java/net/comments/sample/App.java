package net.comments.sample;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ///// Students
        List<Person> personsList = new ArrayList<Person>();

        Student student_1 = new AttentiveStudent("Andrey");
        Student student_2 = new AttentiveStudent("Nastya");
        Student student_3 = new BadStudent("Dima");

        Teacher teacher_1 = new TechTeacher("Dmitriy Sergeevich");
        Teacher teacher_2 = new TechTeacher("Aleksandr Vladimirovich");

        personsList.add(student_1);
        personsList.add(student_2);
        personsList.add(student_3);
        personsList.add(teacher_1);
        personsList.add(teacher_2);

        ///// Rooms

        Room room_1 = new CookingRoom();
        Room room_2 = new TrainingRoom(3, "Training Room 111");


        // Subjects

        Subject subject_1 = new SubjectName("Bake a Cake");
        Subject subject_2 = new SubjectName("Use Git");


        ///// Call methods

        System.out.println("Go_student results:***********");
        go_student(student_1, subject_2);
        go_student(student_2, subject_1);
        go_student(student_3, subject_2);
        System.out.println();

//        System.out.println("Go_room results:***********");
//        go_room(room_2, student_1);
//        go_room(room_2, student_2);
//        go_room(room_2, student_3);
//        go_room(room_2, teacher_1);
//        go_room(room_2, teacher_2);
//        System.out.println();
//
//        System.out.println("Go_teacher results:***********");
//        go_teacher(teacher_1, subject_1);
//        go_teacher(teacher_2, subject_2);
//        System.out.println();

        //Temporary implementation

        int roomCapacity = 0;
        for (int i = 0; i < personsList.size(); i++) {

            if (roomCapacity < room_2.getRoomSize()) {
                System.out.println("There is " + (i + 1) + " persons in the room_2.");
            } else {
                System.out.println("There is no free places in the room_2.");
            }
            roomCapacity++;

        }
        System.out.println();
        for (int i = 0; i < personsList.size(); i++) {

            if (roomCapacity < room_1.getRoomSize()) {
                System.out.println("There is " + (i + 1) + " persons in the room_1.");
            } else {
                System.out.println("There is no free places in the room_1.");
            }
            roomCapacity++;

        }


    }

    private static void go_student(Student someStudent, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someStudent.name()));
        someSubject.learnBy(someStudent);

        System.out.println();
    }

    private static void go_teacher(Teacher someTeacher, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someTeacher.name()));
        someSubject.readBy(someTeacher);

        System.out.println();
    }
//
//    private static void go_student(Student someStudent, Subject someSubject) {
//        System.out.println(String.format("There is %s in the room.", someStudent.name()));
//        someStudent.learn(someSubject);
//        System.out.println();
//    }
//
//    private static void go_room(Room someRoom, Person somePerson) {
//        //System.out.println(String.format("Room contains %s", somePerson.accept()));
//        someRoom.accept(somePerson);
//        System.out.println();
//    }
//
//    private static void go_teacher(Teacher someTeacher, Subject someSubject) {
//        System.out.println(String.format("There is %s in the room.", someTeacher.name()));
//        someTeacher.teach(someSubject);
//        System.out.println();
//    }


}
