package net.comments.sample;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] arg) {

        AttentiveStudent andrey = new AttentiveStudent("Andrey");
        AttentiveStudent nastya = new AttentiveStudent("Nastya");
        AttentiveStudent lena = new AttentiveStudent("Lena");
        AttentiveStudent ivan = new AttentiveStudent("Ivan");
        AttentiveStudent olga = new AttentiveStudent("Olga");
        AttentiveStudent inna = new AttentiveStudent("Inna");
        AttentiveStudent anna = new AttentiveStudent("Anna");
        BadStudent dima = new BadStudent("Dima");

        SubjectGit git = new SubjectGit();
        SubjectCooking cook = new SubjectCooking();

        LimitedRoom limitedRoom = new LimitedRoom(6);
        UnlimitedRoom unlimitedRoom = new UnlimitedRoom();

        TechTeacher sasha = new TechTeacher("Aleksandr Vladimirovich");
        TechTeacher denis = new TechTeacher("Denis Genadiyevich");

//        List<Student> studentList = new ArrayList<Student>();
//        studentList.add(andrey);
//        studentList.add(nastya);
//        studentList.add(lena);
//        studentList.add(ivan);
//        studentList.add(inna);
//        studentList.add(anna);
//        studentList.add(dima);


//        List<Teacher> teacherList = new ArrayList<Teacher>();
//        teacherList.add(sasha);
//        teacherList.add(denis);

        List<Person> personList = new ArrayList<Person>();
        personList.add(andrey);
        personList.add(nastya);
        personList.add(lena);
        personList.add(ivan);
        personList.add(olga);
        personList.add(inna);
        personList.add(anna);
        personList.add(dima);
        personList.add(sasha);
        personList.add(denis);

        System.out.println("Limited Room");
        int i = 0;
        for (i = 0; i < personList.size(); i++) {
            limitedRoom.accept(personList.get(i));
        }

        System.out.println();
        System.out.println("Unlimited Room");
        for (i = 0; i < personList.size(); i++) {
            unlimitedRoom.accept(personList.get(i));
        }

        System.out.println();
        andrey.learn(git);
        nastya.learn(git);
        lena.learn(git);
        olga.learn(git);
        inna.learn(git);
        anna.learn(git);
        ivan.learn(git);
        dima.learn(git);

        System.out.println();
        sasha.teach(git);
        denis.teach(cook);



//        System.out.println();
//        go_student(andrey, git);
//
//        System.out.println();
//        go_teacher(sasha, git);


    }
//    private static void go_student(NewStudent someStudent, NewSubject someSubject) {
//        System.out.println(String.format("There is %s in the room.", someStudent.getNewName()));
//        someStudent.newLearn(someSubject);
//        System.out.println();
//    }
//
//
//    private static void go_teacher(NewTeacher someTeacher, NewSubject someSubject) {
//        System.out.println(String.format("There is %s in the room.", someTeacher.getNewName()));
//        someTeacher.newTeach(someSubject);
//        System.out.println();
//    }
}
