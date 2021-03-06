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


        List<Person> personList = new ArrayList<Person>();
        personList.add(denis);
        personList.add(andrey);
        personList.add(nastya);
        personList.add(lena);
        personList.add(ivan);
        personList.add(olga);
        personList.add(inna);
        personList.add(anna);
        personList.add(dima);
        personList.add(sasha);


        System.out.println("Limited Room accepts:");
        for (Person i : personList) {
            limitedRoom.accept(i);
        }

        System.out.println();
        System.out.println("Students - Teachers in the Limited Room");
        for (Person i : limitedRoom.getPersonInRoom()) {
            if (i instanceof Student) {
                go_student((Student) i, git);
            } else if (i instanceof Teacher) {
                go_teacher((Teacher) i, git);
            }
        }

        System.out.println("Unlimited Room accepts:");
        for (Person i : personList) {
            unlimitedRoom.accept(i);
        }

        System.out.println();
        System.out.println("Students - Teachers in the Unlimited Room");
        for (Person i : unlimitedRoom.getPersonInRoom()) {
            if (i instanceof Student) {
                go_student((Student) i, cook);
            } else if (i instanceof Teacher) {
                go_teacher((Teacher) i, cook);
            }
        }

    }

    private static void go_student(Student someStudent, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someStudent.getName()));
        someStudent.learn(someSubject);
        someSubject.learnBy(someStudent);
        System.out.println();
    }


    private static void go_teacher(Teacher someTeacher, Subject someSubject) {
        System.out.println(String.format("There is %s in the room.", someTeacher.getName()));
        someTeacher.teach(someSubject);
        someSubject.readBy(someTeacher);
        System.out.println();
    }
}
